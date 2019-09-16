package com.xdclass.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author K.Yao
 * @date 2019/9/16 16:39
 */
@ComponentScan("com.xdclass.controller")
@EnableWebMvc
public class WebConfig {
}
