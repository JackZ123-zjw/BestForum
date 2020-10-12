package com.JackZ.BestForum.service;

import com.JackZ.BestForum.Exception.CustomisedErrorCode;
import com.JackZ.BestForum.Exception.CustomisedException;
import com.JackZ.BestForum.mapper.generated.IUserInformationMapper;
import com.JackZ.BestForum.mapper.generated.IUserMapper;
import com.JackZ.BestForum.model.User;
import com.JackZ.BestForum.model.UserExample;
import com.JackZ.BestForum.model.UserInformation;
import com.JackZ.BestForum.model.UserInformationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户信息服务
 * 1. 创建或更新用户信息 createOrUpdate(UserInformation, User)
 * @author JackZ
 * @version 2020-10-12
 */
@Service
public class UserInformationService {

    @Autowired
    private IUserInformationMapper iUserInformationMapper;
    @Autowired
    private IUserMapper iUserMapper;

    /**
     * 创建或更新用户信息
     * @param userInformation
     * @param user
     */
    public void createOrUpdate(UserInformation userInformation, User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andAccountIdEqualTo(user.getAccountId());
        List<User> users = iUserMapper.selectByExample(userExample);
        if (users.isEmpty()) throw new CustomisedException(CustomisedErrorCode.USER_NOT_FOUND);
        user = users.get(0);
        userInformation.setUserId(user.getId());
        List<UserInformation> userInformationList = getUserInformationByUserId(user.getId());
        if (userInformationList.isEmpty()) {
            createUserInformation(userInformation, user.getId());
        } else {
            updateUserInformation(userInformation);
        }
    }

    /**
     * 通过用户id获取用户信息
     * @param userId
     * @return
     */
    public List<UserInformation> getUserInformationByUserId(Long userId) {
        UserInformationExample example = new UserInformationExample();
        example.createCriteria().andUserIdEqualTo(userId);
        return iUserInformationMapper.selectByExample(example);
    }

    /**
     * 创建用户信息
     * @param userInformation
     * @param userId
     */
    private void createUserInformation(UserInformation userInformation, Long userId) {
        userInformation.setUserId(userId);
        iUserInformationMapper.insertSelective(userInformation);
    }

    /**
     * 更新用户信息
     * @param userInformation
     */
    private void updateUserInformation(UserInformation userInformation) {
        UserInformationExample example = new UserInformationExample();
        example.createCriteria().andUserIdEqualTo(userInformation.getUserId());
        iUserInformationMapper.updateByExampleSelective(userInformation, example);
    }
}
