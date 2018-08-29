package com.yunding.mapper;

import com.yunding.pojo.UUserChild;

public interface UUserChildMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UUserChild record);

    int insertSelective(UUserChild record);

    UUserChild selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UUserChild record);

    int updateByPrimaryKey(UUserChild record);
}