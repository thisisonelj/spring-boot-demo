package com.example.spring.boot.demo.power.service.impl;

import com.example.spring.boot.demo.power.dao.AccountUserMapper;
import com.example.spring.boot.demo.power.entity.AccountUserDO;
import com.example.spring.boot.demo.power.service.AccountUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

@Service
public class AccountUserServiceImpl implements AccountUserService {
    @Autowired
    private AccountUserMapper accountUserMapper;

    @Qualifier("redisOperation")
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Integer addAccountUser(AccountUserDO accountUserDO) {
        return accountUserMapper.addAccountUser(accountUserDO);
    }

    @Override
    public Boolean AccountUserLogin(AccountUserDO accountUserDO, HttpServletResponse response, HttpServletRequest request) {
        List<AccountUserDO> accountUserDOlist = accountUserMapper.select(accountUserDO);
        if (accountUserDOlist.isEmpty() || accountUserDOlist == null || accountUserDOlist.size() == 0) {
            return false;
        }
        String token1 = request.getHeader("token");
        System.out.println(token1);
        if (StringUtils.isEmpty(request.getHeader("token"))) {
            String token = UUID.randomUUID().toString();
            redisTemplate.opsForValue().set(token, accountUserDO);
            response.setHeader("token", token);
            response.setHeader("Access-Control-Expose-Headers", "token");
        }
        return true;
    }
}
