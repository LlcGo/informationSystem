package com.lc.TestSql;
import java.util.Date;

import com.lc.domain.InfoTb;
import com.lc.domain.ProductTb;
import com.lc.domain.UserTb;
import com.lc.mapper.InfoTbMapper;
import com.lc.mapper.ProductTbMapper;
import com.lc.mapper.UserTbMapper;
import com.lc.service.InfoTbService;
import com.lc.service.impl.InfoTbServiceImpl;
import com.lc.utils.PageBean;
import com.lc.utils.SqlsessionUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author Lc
 * @Date 2023/5/20
 * @Description
 */
public class test {
    @Test
    public void testinsert(){
        SqlSession sqlSession = SqlsessionUtils.getSqlSession();
        UserTbMapper mapper = sqlSession.getMapper(UserTbMapper.class);
        UserTb user = new UserTb();
        String random = RandomStringUtils.random(6, true, true);
        random = "user" + random;
        System.out.println(random);
        user.setUserName(random);
        user.setUserAccount("HH");
        user.setUserPassword("LL");
        mapper.add(user);
    }

    @Test
    public void all(){
        SqlSession sqlSession = SqlsessionUtils.getSqlSession();
        ProductTbMapper productTbMapper = sqlSession.getMapper(ProductTbMapper.class);
//        List<ProductTb> getall = productTbMapper.getall();
//        for (ProductTb productTb : getall) {
//            System.out.println(productTb);
//        }
    }

    @Test
    public void Page(){
        SqlSession sqlSession = SqlsessionUtils.getSqlSession();
        ProductTbMapper productTbMapper = sqlSession.getMapper(ProductTbMapper.class);
        PageBean pageBean = new PageBean();
        pageBean.setStartRow(0);
        pageBean.setPageSize(3);
        List<ProductTb> getall = productTbMapper.getall(pageBean);
        getall.forEach(a ->{
            System.out.println(a);
        });
    }
}
