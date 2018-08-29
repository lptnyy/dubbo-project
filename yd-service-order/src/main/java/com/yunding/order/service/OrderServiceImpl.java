package com.yunding.order.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yunding.constant.Const;
import com.yunding.order.OrderService;

@Service(version = Const.ORDER_SERVICE_VERSION)
public class OrderServiceImpl implements OrderService{

    @Override
    public String getOrderList() {
        return "订单测试";
    }
}
