package com.xdclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author K.Yao
 * @date 2019/9/17 20:12
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
