package com.xdclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author K.Yao
 * @date 2019/9/17 20:08
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/add")
    public String add() {
        return "product/add";
    }

    @RequestMapping("/update")
    public String update() {
        return "product/update";
    }

    @RequestMapping("/list")
    public String list() {
        return "product/list";
    }

    @RequestMapping("/del")
    public String del() {
        return "product/del";
    }


}
