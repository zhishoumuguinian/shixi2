package com.neuedu.mapper;

import com.neuedu.pojo.Custom;

public interface CustomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Custom record);

    int insertSelective(Custom record);

    Custom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);
}