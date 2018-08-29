package com.yunding.mapper;

import com.yunding.pojo.ServiceUserLog;

public interface ServiceUserLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceUserLog record);

    int insertSelective(ServiceUserLog record);

    ServiceUserLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServiceUserLog record);

    int updateByPrimaryKey(ServiceUserLog record);
}