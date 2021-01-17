package com.upup.purchase.service.impl;

import com.upup.base.util.JsonResponseBody;
import com.upup.base.util.ResponseStatus;
import com.upup.purchase.mapper.OrdersMapper;
import com.upup.purchase.model.Orders;
import com.upup.purchase.service.IOrdersService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private OrdersMapper ordersMapper;


    @Override
    public JsonResponseBody<Integer> insertSelective(Orders orders) {
        int i = ordersMapper.insertSelective(orders);
        if(i==0){
            return new JsonResponseBody<>(ResponseStatus.STATUS_201);
        }
        return new JsonResponseBody<>(i);
    }

    @Override
    public JsonResponseBody<List<Map<String,Object>>> queryall() {
        List<Map<String,Object>> list=ordersMapper.queryall();
        System.out.println(list);
        if(list.size()==0)
            return new JsonResponseBody<>(ResponseStatus.STATUS_202);

        return new JsonResponseBody<>(list);
    }


}
