package com.jia.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

public class MyBatisConfiguration {


    public PageHelper getPageHelper(){
        System.out.println("MyBatisConfiguration.getPageHelper");
        PageHelper pageHelper=new PageHelper();
        Properties pageHelperProperties = new Properties();
        pageHelperProperties.setProperty("offsetAsPageNum", "true");
        pageHelperProperties.setProperty("rowBoundsWithCount", "true");
        pageHelperProperties.setProperty("reasonable", "true");
        pageHelper.setProperties(pageHelperProperties);
        return pageHelper;
    }
}
