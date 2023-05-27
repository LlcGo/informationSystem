package com.lc.service;

import com.lc.domain.ProductTb;
import com.lc.utils.PageBean;

import java.util.List;

/**
 *
 */
public interface ProductTbService  {
    List<ProductTb> getAll(PageBean pageBean);

    Integer getCount();
}
