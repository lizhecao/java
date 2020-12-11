package com.example.sharding_jdbc.service;

import com.example.sharding_jdbc.mapper.OrderMapper;
import com.example.sharding_jdbc.mapper.OrderMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 李哲操
 * @create: 2020-12-09 16:52
 **/
@Service
public class InitServiceImpl implements InitService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderMapper1 orderMapper1;

    @Override
    public void initEnv() {
        orderMapper.createTableIfNotExists();
        orderMapper1.createTableIfNotExists();
    }
}
