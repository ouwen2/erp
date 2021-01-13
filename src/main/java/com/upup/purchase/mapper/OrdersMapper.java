package com.upup.purchase.mapper;

import com.upup.purchase.model.Orders;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrdersMapper {

    int deleteByPrimaryKey(Integer uuid);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    List<Orders> queryall();

}