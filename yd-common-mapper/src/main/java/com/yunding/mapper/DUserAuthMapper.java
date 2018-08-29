package com.yunding.mapper;

import com.yunding.pojo.DUserAuth;

public interface DUserAuthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DUserAuth record);

    int insertSelective(DUserAuth record);

    DUserAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DUserAuth record);

    int updateByPrimaryKey(DUserAuth record);
}