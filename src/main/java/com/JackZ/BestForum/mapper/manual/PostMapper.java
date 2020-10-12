package com.JackZ.BestForum.mapper.manual;

import com.JackZ.BestForum.dto.PostQueryDTO;
import com.JackZ.BestForum.model.Post;
import com.JackZ.BestForum.model.PostExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface PostMapper {

    int increaseCount(Post post);

    int countBySearch(PostQueryDTO record);

    List<Post> selectBySearch(PostQueryDTO record);

    List<Post> selectByExampleWithRowBound(PostExample example, RowBounds rowBounds);

    List<Post> selectRelated(Post post);
}
