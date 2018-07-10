package com.humin.test;

import com.humin.bean.Boss;
import com.humin.bean.Car;
import com.humin.bean.Color;
import com.humin.config.MainConfigOfAutowired;
import com.humin.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:09/07/20181:30 AM
 */
public class IOCTest_Autowired {

    @Test
    public void test01(){
        // 1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);
//        System.out.println(applicationContext.getBean(BookDao.class));

        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);
        System.out.println(applicationContext.getBean(Color.class));
        applicationContext.close();

    }
}
