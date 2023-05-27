package com.lc.mapper;

import com.lc.domain.ProductTb;
import com.lc.utils.PageBean;

import java.util.List;

/**
 * @Entity com.lc.domain.ProductTb
 */
public interface ProductTbMapper{
       List<ProductTb> getall(PageBean pageBean);

       Integer count();
}




