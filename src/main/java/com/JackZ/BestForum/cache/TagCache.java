package com.JackZ.BestForum.cache;

import com.JackZ.BestForum.Exception.CustomisedErrorCode;
import com.JackZ.BestForum.Exception.CustomisedException;
import com.JackZ.BestForum.dto.TagDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.*;

@Component
@Slf4j
public class TagCache {

    private String tagsAddress = "src/main/resources/static/tags.txt";

    private HashMap<String, String> cache = new HashMap<>();

    public TagCache() {
        load();
    }

    @Cacheable(value = "TagDTO", key = "categoryName")
    public TagDTO getTags(String categoryName) {
        String tags = cache.get(categoryName);
        if (tags == null) throw new CustomisedException(CustomisedErrorCode.CATEGORY_NOT_FOUND);
        String[] split = StringUtils.split(tags, ",");
        TagDTO tagDTO = new TagDTO();
        tagDTO.setCategoryName(categoryName);
        tagDTO.setTags(Arrays.asList(split));
        return tagDTO;
    }

    private void load() {
        File file = new File(tagsAddress);

        if (file.exists()) {
            try (FileInputStream stream = new FileInputStream(file);
                 BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {

                while (reader.readLine() != null) {
                    String[] split = StringUtils.split(reader.readLine(),":");
                    if (split.length != 2 || split[0] == null || split[1] == null) continue;
                    cache.put(split[0], split[1]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
