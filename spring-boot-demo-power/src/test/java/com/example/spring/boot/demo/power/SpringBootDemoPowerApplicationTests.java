package com.example.spring.boot.demo.power;

import com.example.spring.boot.demo.power.entity.AccountUserDO;
import com.example.spring.boot.demo.power.service.AccountUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.UUID;

@SpringBootTest
class SpringBootDemoPowerApplicationTests {
    @Autowired
    AccountUserService accountUserService;
    @Test
    void contextLoads() {
        String id= UUID.randomUUID().toString();
        AccountUserDO accountUserDO1=new AccountUserDO();
        accountUserDO1.setId(id);
        accountUserDO1.setUserName("liu");
        accountUserDO1.setRoleId("sssssssss");
        accountUserDO1.setPowerId("ddddddddddd");
        accountUserDO1.setAge(24);
        accountUserDO1.setCreateTime(new Date());
        accountUserService.addAccountUser(accountUserDO1);
    }

}
