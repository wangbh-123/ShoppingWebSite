package com.wbh.handler;

import com.wbh.dao.productDao;
import com.wbh.dao.statusDao;
import com.wbh.po.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wbh
 * @create 2019-11-21-14:38
 */
@RequestMapping("/product")
@Controller
public class productHandler {
    @Autowired
    private productDao pd;
    @Autowired
    private statusDao sd;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<product> all = pd.findAll();
        for (product product : all) {
            System.out.println(product);
        }
        model.addAttribute("productlist",all);
        return "index";
    }

}
