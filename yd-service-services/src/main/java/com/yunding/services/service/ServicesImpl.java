package com.yunding.services.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yunding.constant.Const;
import com.yunding.services.Services;

@Service(version = Const.SERVICES_SERVICE_VERSION)
public class ServicesImpl implements Services{
    @Override
    public void getServicesList() {
        System.out.println("123");
    }
}
