package com.example.spring.boot.demo.power.config;

import com.example.spring.boot.demo.power.interceptor.UserLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author liujun
 * @Date 2023/8/10 17:06
 * @Description
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private UserLoginInterceptor userLoginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(userLoginInterceptor).addPathPatterns("/rest/account/user/login");
    }
}
