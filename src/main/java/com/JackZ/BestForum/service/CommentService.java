package com.JackZ.BestForum.service;

import com.JackZ.BestForum.mapper.generated.ICommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private ICommentMapper iCommentMapper;

}
