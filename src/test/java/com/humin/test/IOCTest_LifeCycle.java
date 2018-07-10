package com.humin.test;

import com.humin.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:09/07/20181:30 AM
 */
public class IOCTest_LifeCycle {

    @Test
    public void test01(){
        // 1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成。。。");

        applicationContext.getBean("car");
        // 关闭容器
        applicationContext.close();
    }
}
