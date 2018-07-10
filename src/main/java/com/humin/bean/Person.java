package com.humin.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:05/07/20183:36 PM
 */
public class Person {
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
    // 使用@Value赋值
    //  1、基本数值
    //  2、可以写SpEL；#{}
    //  3、可以写${};取出配置文件【Properties】的值（在运行环境变量里面的值。）
    @Value("张三")
    private String name;
    @Value("#{20-2}")
    private Integer age;
    @Value("${person.nickName}")
    private String nickName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}