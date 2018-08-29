package com.yunding.mapper;

import com.yunding.pojo.DUser;

public interface DUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DUser record);

    int insertSelective(DUser record);

    DUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DUser record);

    int updateByPrimaryKey(DUser record);
}