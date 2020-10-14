package com.JackZ.BestForum.service;

import com.JackZ.BestForum.cache.TagCache;
import com.JackZ.BestForum.dto.TagDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TagService {

    @Resource
    private TagCache tagCache;

    public List<TagDTO> get() {
        return tagCache.get();
    }
}
