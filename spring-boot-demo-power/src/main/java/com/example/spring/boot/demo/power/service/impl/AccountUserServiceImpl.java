package com.example.spring.boot.demo.power.service.impl;

import com.example.spring.boot.demo.power.dao.AccountUserMapper;
import com.example.spring.boot.demo.power.entity.AccountUserDO;
import com.example.spring.boot.demo.power.service.AccountUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountUserServiceImpl implements AccountUserService {
    @Autowired
    private AccountUserMapper accountUserMapper;

    @Override
    public Integer addAccountUser(AccountUserDO accountUserDO) {
        return accountUserMapper.addAccountUser(accountUserDO);
    }

    @Override
    public Boolean AccountUserLogin(AccountUserDO accountUserDO) {
        List<AccountUserDO> accountUserDOlist = accountUserMapper.select(accountUserDO);
        if(accountUserDOlist.isEmpty()||accountUserDOlist==null||accountUserDOlist.size()==0){
            return false;
        }
        return true;
    }
}
