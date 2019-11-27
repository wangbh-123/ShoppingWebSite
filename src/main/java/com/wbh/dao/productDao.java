package com.wbh.dao;

import com.wbh.po.product;

import java.util.List;

/**
 * @author wbh
 * @create 2019-11-21-14:37
 */
public interface productDao {
    List<product> findAll();
    product findByid(int product_id);
    int delete(int product_id);
    int update(product pro);
    int insert(product pro);
}
