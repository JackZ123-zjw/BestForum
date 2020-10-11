package com.JackZ.BestForum;

import com.JackZ.BestForum.enums.UserPriorityEnum;
import com.JackZ.BestForum.mapper.generated.IUserMapper;
import com.JackZ.BestForum.mapper.manual.UserPriorityMapper;
import com.JackZ.BestForum.model.User;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@Slf4j
@MapperScan("com.JackZ.BestForum.mapper.generated")
@MapperScan("com.JackZ.BestForum.mapper.manual")
public class BestForumApplication implements CommandLineRunner {

	@Autowired
	private IUserMapper iUserMapper;

	@Autowired
	private UserPriorityMapper userPriorityMapper;

	public static void main(String[] args) {
		SpringApplication.run(BestForumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = User.builder()
				.nickname("Jack")
				.accountId("ABC123")
				.email("254519973@qq.com")
				.password("zjw97311")
				.gmtCreate(new Date())
				.gmtModified(new Date())
				.build();

		iUserMapper.insert(user);
		log.info("User: {}", user);
		userPriorityMapper.insertPriority(user.getId(), UserPriorityEnum.LEVEL_0.getCode(), 0);

		Integer priority = userPriorityMapper.findPriorityById(user.getId());
		log.info("priority {}", priority);
	}
}
