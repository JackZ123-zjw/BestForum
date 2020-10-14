package com.JackZ.BestForum;

import com.JackZ.BestForum.mapper.manual.PostMapper;
import com.JackZ.BestForum.service.PostService;
import com.JackZ.BestForum.service.TagService;
import com.JackZ.BestForum.service.UserInformationService;
import com.JackZ.BestForum.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.ArrayList;

@SpringBootApplication
@Slf4j
@MapperScan("com.JackZ.BestForum.mapper.generated")
@MapperScan("com.JackZ.BestForum.mapper.manual")
@EnableCaching
public class BestForumApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	@Autowired
	private UserInformationService userInformationService;
	@Autowired
	private PostService postService;
	@Autowired
	private PostMapper postMapper;
	@Autowired
	private TagService tagService;
//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;

	private String tagsAddress = "src/main/resources/static/tags.txt";
	private ArrayList<String> keys = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(BestForumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<TagDTO> tags = tagCache.get();
//		tags.forEach(t -> log.info("{}: {}", t.getCategoryName(), t.getTags()));

//		File file = new File(tagsAddress);
//
//		if (file.exists()) {
//			try (FileInputStream stream = new FileInputStream(file);
//				 BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
//
//				while (reader.readLine() != null) {
//					String[] split = StringUtils.split(reader.readLine(),":");
//					if (split.length != 2) return;
//					keys.add(split[0]);
//					log.info("categoryname: {}", split[0]);
//					log.info("tags: {}", split[1]);
//					stringRedisTemplate.opsForValue().set(split[0], split[1]);
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

//		stringRedisTemplate.opsForValue().set("xyz", "zxy");
//		log.info("{}", stringRedisTemplate.opsForValue().get("xyz"));

	}
}
