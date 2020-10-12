package com.JackZ.BestForum.service;

import com.JackZ.BestForum.Exception.CustomisedErrorCode;
import com.JackZ.BestForum.Exception.CustomisedException;
import com.JackZ.BestForum.dto.PaginationDTO;
import com.JackZ.BestForum.dto.PostDTO;
import com.JackZ.BestForum.dto.PostQueryDTO;
import com.JackZ.BestForum.enums.SortEnum;
import com.JackZ.BestForum.mapper.generated.IPostMapper;
import com.JackZ.BestForum.mapper.generated.IUserMapper;
import com.JackZ.BestForum.mapper.manual.PostMapper;
import com.JackZ.BestForum.model.Post;
import com.JackZ.BestForum.model.PostExample;
import com.JackZ.BestForum.model.User;
import com.JackZ.BestForum.support.TagAndSearchUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 帖子服务
 * 1. 创建或更新帖子信息。
 * @author JackZ
 * @version 2020-10-12
 */
@Service
public class PostService {

    @Autowired
    private IPostMapper iPostMapper;
    @Autowired
    private PostMapper postMapper;
    @Autowired
    private IUserMapper iUserMapper;
    /**
     * 创建或更新帖子
     * @param post
     */
    public void createOrUpdate(Post post) {

        if (post.getId() == null) {
            createPost(post);
        } else {
            // 验证post的合法性。
            // 1.是否存在。
            // 2. 作者是否匹配
            Post dbPost = iPostMapper.selectByPrimaryKey(post.getId());
            if (dbPost == null) {
                throw new CustomisedException(CustomisedErrorCode.POST_NOT_FOUND);
            }
            if (!post.getCreatorId().equals(dbPost.getCreatorId())) {
                throw new CustomisedException(CustomisedErrorCode.CREATOR_NOT_MATCH);
            }
            updatePost(post);
        }
    }

    /**
     * 通过id查找post
     * @param id
     * @return
     */
    public Post getPostById(Long id) {
        Post post = iPostMapper.selectByPrimaryKey(id);
        if (post == null) {
            throw new CustomisedException(CustomisedErrorCode.POST_NOT_FOUND);
        }
        return post;
    }

    public List<Post> getPostByCreator(Long creatorId) {
        PostExample example = new PostExample();
        example.createCriteria().andCreatorIdEqualTo(creatorId);
        return iPostMapper.selectByExample(example);
    }

    /**
     * 增加view
     * @param id
     */
    public void incView(Long id) {
        Post post = new Post();
        post.setViewCount(1);
        post.setId(id);
        postMapper.increaseCount(post);
    }

    public void incComment(Long id) {
        Post post = new Post();
        post.setCommentCount(1);
        post.setId(id);
        postMapper.increaseCount(post);
    }

    public void incLike(Long id) {
        Post post = new Post();
        post.setLikeCount(1);
        post.setId(id);
        postMapper.increaseCount(post);
    }

    /**
     * 根据搜索条件列出帖子
     * @param search
     * @param tag
     * @param sort
     * @param page
     * @param size
     * @return
     */
    public PaginationDTO<PostDTO> listBySearch(String search, String tag, String sort, Integer page, Integer size) {

        search = TagAndSearchUtils.trimSearch(search);

        tag = tag.replace("+", "").replace("*", "").replace("+", "");

        PaginationDTO<PostDTO> paginationDTO = new PaginationDTO<>();

        PostQueryDTO postQueryDTO = new PostQueryDTO();
        postQueryDTO.setSearch(search);
        postQueryDTO.setTags(tag);

        for (SortEnum e : SortEnum.values()) {
            if (e.name().toLowerCase().equals(sort)) {
                postQueryDTO.setSort(sort);
                postQueryDTO.setTime(SortEnum.getLatestTimeBySortEnum(e));
            }
            break;
        }

        int totalPosts = postMapper.countBySearch(postQueryDTO);

        paginationDTO.setPagination(totalPosts, size, page);
        int offset = page < 1 ? 0 : size * (page - 1);
        postQueryDTO.setSize(size);
        postQueryDTO.setPage(offset);
        List<Post> posts = postMapper.selectBySearch(postQueryDTO);
        List<PostDTO> postDTOs = new ArrayList<>();
        for (Post post : posts) {
            User user = iUserMapper.selectByPrimaryKey(post.getCreatorId());
            PostDTO postDTO = new PostDTO();
            postDTO.setUser(user);
            BeanUtils.copyProperties(post, postDTO);
            postDTOs.add(postDTO);
        }

        paginationDTO.setData(postDTOs);
        return paginationDTO;
    }

    public PaginationDTO<PostDTO> listByUserId(Long userId, Integer page, Integer size) {
        PaginationDTO<PostDTO> paginationDTO = new PaginationDTO<>();

        PostExample example = new PostExample();
        example.createCriteria().andCreatorIdEqualTo(userId);
        int totalPages = (int) iPostMapper.countByExample(example);
        paginationDTO.setPagination(totalPages, size, page);
        int offset = size * (page - 1);
        PostExample postExample = new PostExample();
        postExample.createCriteria().andCreatorIdEqualTo(userId);
        List<Post> posts = postMapper.selectByExampleWithRowBound(example, new RowBounds(offset, size));
        List<PostDTO> postDTOs = new ArrayList<>();
        for (Post post : posts) {
            User user = iUserMapper.selectByPrimaryKey(post.getCreatorId());
            PostDTO postDTO = new PostDTO();
            BeanUtils.copyProperties(post, postDTO);
            postDTO.setUser(user);
            postDTOs.add(postDTO);
        }
        paginationDTO.setData(postDTOs);
        return paginationDTO;
    }

    public List<PostDTO> selectRelated(PostDTO postDTO) {
        String tags = postDTO.getTags();
        tags = TagAndSearchUtils.trimSearch(tags);
        Post post = new Post();
        post.setCreatorId(postDTO.getUser().getId());
        post.setTags(tags);
        List<Post> posts = postMapper.selectRelated(post);

        List<PostDTO> postDTOs = new ArrayList<>();
        for (Post p : posts) {
            User user = iUserMapper.selectByPrimaryKey(p.getCreatorId());
            PostDTO postDTO1 = new PostDTO();
            BeanUtils.copyProperties(p, postDTO1);
            postDTO1.setUser(user);
            postDTOs.add(postDTO);
        }
        return postDTOs;
    }

    /**
     * 创建帖子
     * @param post
     */
    private void createPost(Post post) {
        post.setGmtCreate(System.currentTimeMillis());
        post.setGmtModified(System.currentTimeMillis());
        post.setGmtLatestComment(System.currentTimeMillis());
        iPostMapper.insertSelective(post);
    }

    /**
     * 更新帖子
     * @param post
     */
    private void updatePost(Post post) {
        post.setGmtModified(System.currentTimeMillis());
        PostExample example = new PostExample();
        example.createCriteria().andIdEqualTo(post.getId());
        int updated = iPostMapper.updateByExampleSelective(post, example);
        if (updated != 1) {
            throw new CustomisedException(CustomisedErrorCode.POST_NOT_FOUND);
        }
    }
}
