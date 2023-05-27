package com.lc.controller;

import com.lc.domain.ProductTb;
import com.lc.service.ProductTbService;
import com.lc.service.impl.ProductTbServiceImpl;
import com.lc.utils.PageBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author Lc
 * @Date 2023/5/27
 * @Description
 */
public class ProduceController extends HttpServlet {
    ProductTbService productTbService = new ProductTbServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        switch (name){
            case "getall":
                getAll(req,resp);
                break;
            default:
        }
    }

    protected void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageNoStr = req.getParameter("pageNo");
        int page = 1;
        if(pageNoStr != null){
            page = Integer.parseInt(pageNoStr);
        }
        Integer count = productTbService.getCount();
        PageBean pageBean = new PageBean(page, count, 3);
        List<ProductTb> products = productTbService.getAll(pageBean);
        req.getSession().setAttribute("page",pageBean);
        req.getSession().setAttribute("products",products);
        req.getRequestDispatcher("/product.jsp").forward(req,resp);
    }
}
