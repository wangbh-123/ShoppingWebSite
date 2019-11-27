package com.wbh.service;

import com.wbh.dao.statusDao;
import com.wbh.po.status;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wbh
 * @create 2019-11-27-14:04
 */
@Service
public class statusServiceImpl implements statusService {
    @Resource
    private statusDao sd;
    public List<status> findAll1() {
        return sd.findAll1();
    }

    public status findByid1(int status_id) {
        return sd.findByid1(status_id);
    }

    public int delete1(int status_id) {
        return sd.delete1(status_id);
    }

    public int update1(status sta) {
        return sd.update1(sta);
    }

    public int insert1(status sta) {
        return sd.insert1(sta);
    }
}
