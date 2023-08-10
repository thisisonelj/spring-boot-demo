package com.example.spring.boot.demo.power.dao;

import com.example.spring.boot.demo.power.entity.AccountPowerDO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @Author liujun
 * @Date 2023/8/8 21:54
 * @Description
 */

@Repository
public interface AccountPowerMapper extends BaseMapper<AccountPowerDO> {
}
