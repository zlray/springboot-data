package org.spring.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C)，XX
 * FileName: DruidConfig
 * Author: zl
 * Date: 2019/2/14  21:36
 * Description: druid的配置类
 **/
@Configuration
public class DruidConfig {


    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource(){
        return new DruidDataSource();
    }

//    配置管理后台的servlet
    @Bean
    public ServletRegistrationBean registrationBean(){
        ServletRegistrationBean servletRegistrationBean =
                new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        //设置初始化的参数
        Map<String,String> initParams = new HashMap<>();
        initParams.put("loginUsername","zl");
        initParams.put("loginPassword","123456");
        initParams.put("allow","192.168.150.1");
//        initParams.put("allow","");//为空就是默认允许所有访问
        //拒绝访问的
//        initParams.put("deny","");
        servletRegistrationBean.setInitParameters(initParams);
        return  servletRegistrationBean;
    }

//    配置一个web监控的filter
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setFilter(new WebStatFilter());
        Map<String,String> initParams = new HashMap<>();
        //忽略资源文件 图片等
        initParams.put("exclusions","*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
        filter.setInitParameters(initParams);
        filter.setUrlPatterns(Arrays.asList("/*"));

        return filter;
    }
}
