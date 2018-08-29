package com.yunding.mapper;

import com.yunding.pojo.App;

public interface AppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(App record);

    int insertSelective(App record);

    App selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(App record);

    int updateByPrimaryKey(App record);
}