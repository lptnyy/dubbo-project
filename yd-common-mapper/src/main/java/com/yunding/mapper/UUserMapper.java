package com.yunding.mapper;

import com.yunding.pojo.UUser;

import java.util.List;

public interface UUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UUser record);

    int insertSelective(UUser record);

    UUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);

    List<UUser> getListAll();

}