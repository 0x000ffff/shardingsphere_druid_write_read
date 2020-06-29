package com.tuling.shardingsphere.demo1.service;

import com.tuling.shardingsphere.demo1.dto.Test;

/**
 * @author ：sunpengcheng
 * @version :
 * @date ：Created in 2020/6/29 16:26
 * @description ：
 */
public interface TestService {
    Object add(Test test);
    Object query(Integer id);
    Object delete(Integer id);
    Object update(Test test);
}
