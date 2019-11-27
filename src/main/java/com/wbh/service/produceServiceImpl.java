package com.wbh.service;

import com.wbh.dao.productDao;
import com.wbh.po.product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wbh
 * @create 2019-11-21-15:07
 */
@Service
public class produceServiceImpl implements produtService {
    @Resource
    private productDao pd;
    public List<product> findAll() {
        return pd.findAll();
    }

    public product findByid(int product_id) {
        return pd.findByid(product_id);
    }

    public product delete(int product_id) {
        return pd.findByid(product_id);
    }

    public int update(product pro) {
        return pd.update(pro);
    }

    public int insert(product pro) {
        return pd.insert(pro);
    }
}
