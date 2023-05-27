package com.lc.service.impl;

import com.lc.domain.ProductTb;
import com.lc.service.ProductTbService;
import com.lc.mapper.ProductTbMapper;
import com.lc.utils.PageBean;
import com.lc.utils.SqlsessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 *
 */
public class ProductTbServiceImpl implements ProductTbService{
    SqlSession sqlSession = SqlsessionUtils.getSqlSession();
    ProductTbMapper productDao = sqlSession.getMapper(ProductTbMapper.class);

    @Override
    public List<ProductTb> getAll(PageBean pageBean) {
        return productDao.getall(pageBean);
    }

    @Override
    public Integer getCount() {
        return productDao.count();
    }
}




