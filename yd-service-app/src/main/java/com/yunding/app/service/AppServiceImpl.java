package com.yunding.app.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yunding.app.AppService;
import com.yunding.constant.Const;

@Service(version = Const.APP_SERVICE_VERSION)
public class AppServiceImpl implements AppService{
    @Override
    public void getList() {

    }
}
