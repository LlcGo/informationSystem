package com.lc.service;

import com.lc.domain.UserTb;

/**
 *
 */
public interface UserTbService {

    UserTb login(String userAccount, String userPassword);

    UserTb register(String userAccount, String userPassword);
}
