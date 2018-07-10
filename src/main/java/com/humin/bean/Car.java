package com.humin.bean;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:09/07/20181:27 AM
 */
@Component
public class Car {

    public Car(){
        System.out.println("car constructor...");
    }

    public void init(){
        System.out.println("car... init...");
    }

    public void destory(){
        System.out.println("car... destory...");
    }
}
