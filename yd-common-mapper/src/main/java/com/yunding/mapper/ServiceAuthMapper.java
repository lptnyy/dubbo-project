package com.yunding.mapper;

import com.yunding.pojo.ServiceAuth;

public interface ServiceAuthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceAuth record);

    int insertSelective(ServiceAuth record);

    ServiceAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServiceAuth record);

    int updateByPrimaryKey(ServiceAuth record);
}