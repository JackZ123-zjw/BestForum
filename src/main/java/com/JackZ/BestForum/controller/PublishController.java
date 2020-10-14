package com.JackZ.BestForum.controller;

import com.JackZ.BestForum.dto.PostDTO;
import com.JackZ.BestForum.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PublishController {

    @Autowired
    private PostService postService;

    @GetMapping("/publish/{id}")
    public Object edit(@PathVariable("id") Long id, Model model) {
        PostDTO postDTO = postService.getPostById(id);
        model.addAttribute("title", postDTO.getTitle());
        model.addAttribute("description", postDTO.getContent());
        model.addAttribute("tag", postDTO.getTags());
        model.addAttribute("id", postDTO.getId());
        return "publish";
    }

//    @GetMapping("/publish")
//    public String publish(Model model) {
//
//    }
}
