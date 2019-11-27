package com.wbh.service;

import com.wbh.po.product;

import java.util.List;

/**
 * @author wbh
 * @create 2019-11-21-14:38
 */
public interface produtService {
    List<product> findAll();
    product findByid(int product_id);
    product delete(int product_id);
    int update(product pro);
    int insert(product pro);
}
