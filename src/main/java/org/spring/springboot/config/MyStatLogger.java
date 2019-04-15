package org.spring.springboot.config;

import com.alibaba.druid.pool.DruidDataSourceStatLogger;
import com.alibaba.druid.pool.DruidDataSourceStatLoggerAdapter;
import com.alibaba.druid.pool.DruidDataSourceStatValue;


/**
 * Copyright (C)，XX
 * FileName: MyStatLogger
 * Author: zl
 * Date: 2019/2/15  11:15
 * Description: Druid的监控记录
 **/
public class MyStatLogger  extends DruidDataSourceStatLoggerAdapter implements DruidDataSourceStatLogger {


//    private Logger logger = LoggerFactory.getLogger(StatLogger.class);

    @Override
    public void log(DruidDataSourceStatValue statValue) {
        super.log(statValue);
    }
}
