package com.lc.testuserController;

import com.lc.domain.UserTb;
import com.lc.service.UserTbService;
import com.lc.service.impl.UserTbServiceImpl;

/**
 * @Author Lc
 * @Date 2023/5/20
 * @Description
 */
public class Test {
   UserTbService userTbService = new UserTbServiceImpl();

    @org.junit.jupiter.api.Test
    public void test(){
        UserTb login = userTbService.login("hello", "123456");
        System.out.println(login);
    }

}
