package com.yunding.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yunding.constant.Const;
import com.yunding.mapper.UUserMapper;
import com.yunding.model.UUserModel;
import com.yunding.pojo.UUser;
import com.yunding.user.UserServiceI;
import com.yunding.util.DateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import java.util.ArrayList;
import java.util.List;

@Service(version = Const.USER_SERVICE_VERSION)
public class UserServiceImpl implements UserServiceI {
    @Autowired
    UUserMapper uUserMapper;

    @Override
    public List<UUserModel> getUserList() {
        List<UUser> uUsers = uUserMapper.getListAll();
        List<UUserModel> userModels = new ArrayList<>();
        for(UUser user:uUsers) {
            UUserModel uUserModel = new UUserModel();
            BeanUtils.copyProperties(user,uUserModel);
            uUserModel.setCreateTime(DateUtil.getyyMMddHHmmss(user.getCreateTime()));
            uUserModel.setUpdateTime(DateUtil.getyyMMddHHmmss(user.getUpdateTime()));
            uUserModel.setSex(Integer.valueOf(user.getSex()));
            uUserModel.setStatus(Integer.valueOf(user.getStatus()));
            userModels.add(uUserModel);
        }
        return userModels;
    }
}
