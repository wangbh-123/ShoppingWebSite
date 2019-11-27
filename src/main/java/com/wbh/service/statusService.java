package com.wbh.service;

import com.wbh.po.status;

import java.util.List;

/**
 * @author wbh
 * @create 2019-11-27-14:04
 */
public interface statusService {
    List<status> findAll1();
    status findByid1(int status_id);
    int delete1(int status_id);
    int update1(status sta);
    int insert1(status sta);
}
