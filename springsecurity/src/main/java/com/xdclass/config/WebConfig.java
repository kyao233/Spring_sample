package com.xdclass.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author K.Yao
 * @date 2019/9/16 16:39
 */
@ComponentScan("com.xdclass.controller")
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //NOTE: need slash after "pages"!!!!
        registry.jsp("/WEB-INF/pages/", ".jsp");
    }


}
