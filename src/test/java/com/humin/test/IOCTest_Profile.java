package com.humin.test;

import com.humin.bean.Boss;
import com.humin.bean.Car;
import com.humin.bean.Color;
import com.humin.config.MainConfigOfAutowired;
import com.humin.config.MainConfigOfProfile;
import com.humin.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:09/07/20181:30 AM
 */
public class IOCTest_Profile {

    // 1、使用命令行参数：在虚拟机参数位置加载 -Dspring.profiles.active=test
    // 2、使用代码的方式：激活某种方式。
    @Test
    public void test01(){
        // 1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 1.创建一个applicationContext
        // 2.设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("dev");
        // 3.注册配置类
        applicationContext.register(MainConfigOfProfile.class);
        // 4.启动刷新容器
        applicationContext.refresh();

        String[] names = applicationContext.getBeanNamesForType(DataSource.class);
        for(String name : names){
            System.out.println(name);
        }

        applicationContext.close();

    }
}
