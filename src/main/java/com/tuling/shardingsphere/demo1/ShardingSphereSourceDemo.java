package com.tuling.shardingsphere.demo1;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：sunpengcheng
 * @version : 1.0
 * @date ：Created in 2020/6/29 12:27
 * @description ：shardingsphere demo
 */
public class ShardingSphereSourceDemo {
    public static void main(String[] args) {
        Map<String, DataSource> dataSourceMap =  new HashMap<>(2);

        DruidDataSource dataSource1 = new DruidDataSource();
        dataSource1.setUrl("jdbc:mysql://localhost:3307/tuling?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=Hongkong");
        dataSource1.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource1.setUsername("user");
        dataSource1.setPassword("123456");

        DruidDataSource dataSource2 = new DruidDataSource();
        dataSource2.setUrl("jdbc:mysql://localhost:3308/tuling?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=Hongkong");
        dataSource2.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource2.setUsername("user");
        dataSource2.setPassword("123456");

        dataSourceMap.put("ds1",dataSource1);
        dataSourceMap.put("ds2",dataSource2);


    }
}
