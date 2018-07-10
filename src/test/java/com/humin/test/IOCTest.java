package com.humin.test;

import com.humin.bean.Person;
import com.humin.config.MainConfig;
import com.humin.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:05/07/20184:27 PM
 */
public class IOCTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void test04(){
        printBeanNames(applicationContext);

        // 工厂bean获取的是调用getObject创建的对象。
        Object bean = applicationContext.getBean("colorFactoryBean");
        Object bean1 = applicationContext.getBean("colorFactoryBean");
        System.out.println("bean的类型："+bean.getClass());
        System.out.println(bean==bean1);

        Object bean2 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(bean2.getClass());
    }

    public void printBeanNames(AnnotationConfigApplicationContext applicationContext){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:beanDefinitionNames ) {
            System.out.println(name);
        }
    }

    @Test
    public void test03(){
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name:beanNamesForType){
            System.out.println(name);
        }
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        System.out.println(environment.getProperty("os.name"));

        Map<String, Person> ofType = applicationContext.getBeansOfType(Person.class);
        System.out.println(ofType);
    }

    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for(String name : definitionNames){
            System.out.println(name);
        }
    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
//        String[] definitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
//        for(String name : definitionNames){
//            System.out.println(name);
//        }
        System.out.println("ioc容器创建完成！ ");
        Object person = annotationConfigApplicationContext.getBean("person");
        Object person2 = annotationConfigApplicationContext.getBean("person");
        System.out.println(person==person2);
    }
}
