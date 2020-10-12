package com.JackZ.BestForum;

import com.JackZ.BestForum.mapper.manual.PostMapper;
import com.JackZ.BestForum.model.Post;
import com.JackZ.BestForum.model.PostExample;
import com.JackZ.BestForum.service.PostService;
import com.JackZ.BestForum.service.UserInformationService;
import com.JackZ.BestForum.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@Slf4j
@MapperScan("com.JackZ.BestForum.mapper.generated")
@MapperScan("com.JackZ.BestForum.mapper.manual")
public class BestForumApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	@Autowired
	private UserInformationService userInformationService;
	@Autowired
	private PostService postService;
	@Autowired
	private PostMapper postMapper;

	public static void main(String[] args) {
		SpringApplication.run(BestForumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PostExample example = new PostExample();
		example.createCriteria().andCreatorIdEqualTo(2L);
		List<Post> posts = postMapper.selectByExampleWithRowBound(example, new RowBounds(1, 2));
		posts.forEach(p -> {
			log.info("postid : {}", p.getId());
		});
	}
}
