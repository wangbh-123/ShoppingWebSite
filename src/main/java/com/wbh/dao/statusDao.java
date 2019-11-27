package com.wbh.dao;

import com.wbh.po.product;
import com.wbh.po.status;

import java.util.List;

/**
 * @author wbh
 * @create 2019-11-27-13:51
 */
public interface statusDao {
    List<status> findAll1();
    status findByid1(int status_id);
    int delete1(int status_id);
    int update1(status sta);
    int insert1(status sta);

}
