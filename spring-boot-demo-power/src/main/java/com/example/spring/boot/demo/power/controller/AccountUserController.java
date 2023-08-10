package com.example.spring.boot.demo.power.controller;

import com.example.spring.boot.demo.power.entity.AccountUserDO;
import com.example.spring.boot.demo.power.service.AccountUserService;
import com.example.spring.boot.demo.power.utils.AcctResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author liujun
 * @Date 2023/8/9 10:09
 * @Description
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/rest/account/user")
public class AccountUserController {
    @Autowired
    private AccountUserService accountUserService;

    @PostMapping(value = "login")
    AcctResult<Object> accountUserLogin(@RequestBody AccountUserDO accountUserDO, HttpServletResponse response,HttpServletRequest request) {
        return AcctResult.resultSuccessful(accountUserService.AccountUserLogin(accountUserDO,response,request));
    }

}
