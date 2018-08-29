package com.yunding.mapper;

import com.yunding.pojo.UUserLog;

public interface UUserLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UUserLog record);

    int insertSelective(UUserLog record);

    UUserLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UUserLog record);

    int updateByPrimaryKey(UUserLog record);
}