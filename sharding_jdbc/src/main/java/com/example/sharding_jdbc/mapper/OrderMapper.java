package com.example.sharding_jdbc.mapper;

import com.example.sharding_jdbc.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByOrderIdNUserId(@Param("userId") Long userId, @Param("orderId") Long orderId);

    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    Order selectByUserIdNOrderId(@Param("userId") Long userId, @Param("orderId") Long orderId);

    List<Order> select(@Param("offset") Integer offset, @Param("size") Integer size);

    List<Order> selectByUserId(Long userId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    void createTableIfNotExists();

    void dropTable();

    void truncateTable();
}