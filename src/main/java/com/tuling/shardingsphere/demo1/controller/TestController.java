package com.tuling.shardingsphere.demo1.controller;

import com.tuling.shardingsphere.demo1.dto.Test;
import com.tuling.shardingsphere.demo1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：sunpengcheng
 * @version :
 * @date ：Created in 2020/6/29 16:32
 * @description ：
 */
@RestController
public class TestController {

    @Autowired
    public TestService testService;

    @RequestMapping("add")
    public Object add(){
        Test test = new Test();
        test.setName("bilibili");
        return testService.add(test);
    }

    @RequestMapping("delete")
    public Object delete(){
        return testService.delete(1);
    }

    @RequestMapping("select")
    public Object select(){
        return testService.query(5);
    }

    @RequestMapping("select1")
    public Object select1(){
        return testService.query(4);
    }

    @RequestMapping("update")
    public Object update(){
        Test test = new Test();
        test.setName("acfun-acfun");
        return testService.update(test);
    }

}
