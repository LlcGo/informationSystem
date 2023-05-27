package com.lc.controller;

import com.lc.domain.UserTb;
import com.lc.service.UserTbService;
import com.lc.service.impl.UserTbServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Lc
 * @Date 2023/5/20
 * @Description
 */
public class UserController extends HttpServlet {

    private UserTbService  userService =  new UserTbServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("sendName");
        switch(name){
            case "login" :
                login(req,resp);
                break; //可选
            case  "register" :
                register(req,resp);
            default :
        }
    }

    //登录
    protected void login(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        String userAccount = req.getParameter("userAccount");
        String userPassword = req.getParameter("userPassword");
        UserTb userTb = userService.login(userAccount, userPassword);
        if(userTb == null){
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
        req.getSession().setAttribute("user",userTb);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    //注册
    protected void register(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        String userAccount = req.getParameter("userAccount");
        String userPassword = req.getParameter("userPassword");
        UserTb userTb = userService.register(userAccount, userPassword);
        //为空不能注册 用户已经存在
        if(userTb == null){
            req.getRequestDispatcher("/register.jsp").forward(req,resp);
        }
        //注册成功跳转登录页面
        req.getRequestDispatcher("/login.jsp").forward(req,resp);
    }



}
