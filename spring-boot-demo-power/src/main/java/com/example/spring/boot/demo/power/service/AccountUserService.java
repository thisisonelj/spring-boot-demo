package com.example.spring.boot.demo.power.service;

import com.example.spring.boot.demo.power.entity.AccountUserDO;

public interface AccountUserService {
    /**
     * @Author LiuJun
     * @Description 添加用户
     * @Date 19:39 2023/8/8
     * @Param [accountUserDO]
     * @Return java.lang.Integer
     **/
    Integer addAccountUser(AccountUserDO accountUserDO);
    /**
     * @Author LiuJun
     * @Description  用户登录
     * @Date 10:03 2023/8/9
     * @Param [accountUserDO]
     * @Return java.lang.Boolean
     **/
    Boolean AccountUserLogin(AccountUserDO accountUserDO);
}
