package com.humin;

import com.humin.bean.Person;
import com.humin.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:05/07/20183:45 PM
 */
public class MainTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Object person = classPathXmlApplicationContext.getBean("person");
//        System.out.println(person);
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Object person = applicationContext.getBean(Person.class);
        System.out.println(person);

        String[] names = applicationContext.getBeanNamesForType(Person.class);
        for(String name : names){
            System.out.println(name);
        }
    }
}
