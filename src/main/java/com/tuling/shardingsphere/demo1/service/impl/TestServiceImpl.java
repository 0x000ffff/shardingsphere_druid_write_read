package com.tuling.shardingsphere.demo1.service.impl;

import com.tuling.shardingsphere.demo1.dto.Test;
import com.tuling.shardingsphere.demo1.service.TestService;
import com.tuling.shardingsphere.demo1.mapper.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：sunpengcheng
 * @version :
 * @date ：Created in 2020/6/29 16:29
 * @description ：
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;
    @Override
    public Object add(Test test) {
        return testDao.insert(test);
    }

    @Override
    public Object query(Integer id) {
        return testDao.selectByPrimaryKey(id);
    }

    @Override
    public Object delete(Integer id) {
        return testDao.deleteByPrimaryKey(id);
    }

    @Override
    public Object update(Test test) {
        return testDao.updateByPrimaryKey(test);
    }
}
