package com.tuling.shardingsphere.demo1.mapper;

import com.tuling.shardingsphere.demo1.dto.Test;

public interface TestDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}