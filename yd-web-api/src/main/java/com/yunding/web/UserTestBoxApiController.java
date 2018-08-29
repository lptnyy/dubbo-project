package com.yunding.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yunding.app.AppService;
import com.yunding.constant.Const;
import com.yunding.order.OrderService;
import com.yunding.services.Services;
import com.yunding.user.UserServiceI;
import com.yunding.util.annotation.factory.Verification;
import com.yunding.util.jsonvo.JsonVo;
import com.yunding.web.parameter.Add;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTestBoxApiController {

    @Reference(version = Const.USER_SERVICE_VERSION)
    UserServiceI userServiceI;
    @Reference(version = Const.ORDER_SERVICE_VERSION)
    OrderService orderService;
    @Reference(version = Const.SERVICES_SERVICE_VERSION)
    Services services;
    @Reference(version = Const.APP_SERVICE_VERSION)
    AppService appService;

    @RequestMapping(path = "/stat")
    public String stat(){
        return new JsonVo()
                .setResult(true)
                .setBusiness(jsonVo -> {
                    try {
                        jsonVo.setObject(userServiceI.getUserList());
                    }catch (Exception e) {
                        jsonVo.setBody(e.getMessage(), false);
                    }
                    return jsonVo;
                }).init().returnJsonString();
    }

    @RequestMapping(path = "add")
    public String add(Add add){
        return Verification.verification(add)
                .setBusiness(jsonVo -> {

                    return jsonVo;
                }).init().returnJsonString();
    }

    @RequestMapping(path = "order")
    public String add(){
        return new JsonVo().setResult(true)
                .setBusiness(jsonVo -> {
                    jsonVo.setObject(orderService.getOrderList());
                    return jsonVo;
                }).init().returnJsonString();
    }
}
