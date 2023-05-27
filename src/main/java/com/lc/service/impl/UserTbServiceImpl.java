package com.lc.service.impl;

import com.lc.domain.UserTb;
import com.lc.service.UserTbService;
import com.lc.mapper.UserTbMapper;
import com.lc.utils.SqlsessionUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;

/**
 *
 */
public class UserTbServiceImpl implements UserTbService{


    @Override
    public UserTb login(String userAccount, String userPassword) {
        SqlSession sqlSession = SqlsessionUtils.getSqlSession();
        UserTbMapper userMapper = sqlSession.getMapper(UserTbMapper.class);
        if(StringUtils.isAnyEmpty(userAccount,userPassword)){
             return null;
        }
        UserTb userTb = userMapper.selectUserByNameAndPassword(userAccount, userPassword);
        if(userTb == null){
            return null;
        }
            return userTb;
    }

    //注册
    @Override
    public UserTb register(String userAccount, String userPassword) {
        SqlSession sqlSession = SqlsessionUtils.getSqlSession();
        UserTbMapper userDAO = sqlSession.getMapper(UserTbMapper.class);
        UserTb userTb = userDAO.selectUserByNameAndPassword(userAccount, userPassword);
        //如果用户存在返回空 不能注册这个用户
        if(userTb != null){
            return null;
        }
        UserTb user = new UserTb();
        String random = RandomStringUtils.random(6, true, true);
        random = "user" + random;
        user.setUserName(random);
        user.setUserAccount(userAccount);
        user.setUserPassword(userPassword);
        userDAO.add(user);
        //用户不存在注册成功
        return user;
    }
}




