package com.JackZ.BestForum.service;

import com.JackZ.BestForum.Exception.CustomisedErrorCode;
import com.JackZ.BestForum.Exception.CustomisedException;
import com.JackZ.BestForum.enums.UserPriorityEnum;
import com.JackZ.BestForum.mapper.generated.IUserMapper;
import com.JackZ.BestForum.model.User;
import com.JackZ.BestForum.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 处理用户需求。
 * 1. 创建或更改用户   createOrUpdate(User).
 * 2. 增加用户分数    addScore(User, Integer).
 * @author JackZ
 * @version 2020-10-12
 */
@Service
public class UserService {

    @Autowired
    private IUserMapper iUserMapper;

    /**
     * 创建或更改用户。
     * @param user
     */
    public void createOrUpdate(User user) {
        List<User> possibleUsers = getUserByAccountId(user.getAccountId());
        if (possibleUsers.isEmpty()) {
            createUser(user);
        } else {
            updateUser(possibleUsers.get(0), user);
        }
    }

    /**
     * 通过用户账户名获取用户
     * @param accountId
     * @return
     */
    public List<User> getUserByAccountId(String accountId) {
        UserExample example = new UserExample();
        example.createCriteria()
                .andAccountIdEqualTo(accountId);
        return iUserMapper.selectByExample(example);
    }

    /**
     * 增加用户分数
     * @param user
     * @param score
     */
    public void addScore(User user, Integer score) {
        UserExample example = new UserExample();
        example.createCriteria()
                .andAccountIdEqualTo(user.getAccountId());
        List<User> possibleUsers = iUserMapper.selectByExample(example);
        if (possibleUsers.isEmpty()) {
            throw new CustomisedException(CustomisedErrorCode.USER_NOT_FOUND);
        }
        user = possibleUsers.get(0);
        score = user.getScore() + score;
        user.setScore(score);
        user.setPriority(UserPriorityEnum.getLevelByScore(score));
        iUserMapper.updateByExampleSelective(user, example);

    }

    /**
     * 创建用户
     * @param user
     */
    private void createUser(User user) {
        user.setGmtCreate(System.currentTimeMillis());
        user.setGmtModified(System.currentTimeMillis());
        iUserMapper.insertSelective(user);
    }

    /**
     * 更新用户信息
     * @param dbUser
     * @param user
     */
    private void updateUser(User dbUser, User user) {
        User updatedUser = new User();
        updatedUser.setGmtModified(System.currentTimeMillis());
        updatedUser.setAvatarUrl(user.getAvatarUrl());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setNickname(user.getNickname());
        updatedUser.setPhone(user.getPhone());
        updatedUser.setToken(user.getToken());
        UserExample example = new UserExample();
        example.createCriteria()
                .andIdEqualTo(dbUser.getId());
        int updated = iUserMapper.updateByExampleSelective(updatedUser, example);
        if (updated != 1) {
            throw new CustomisedException(CustomisedErrorCode.USER_NOT_FOUND);
        }
    }




}
