package com.humin.config;

import com.humin.bean.Person;
import com.humin.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:05/07/20183:48 PM
 */
// 配置类==配置文件
@Configuration    // 告诉Spring这是一个配置类
@ComponentScans({
        @ComponentScan(value = "com.humin",includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
        },useDefaultFilters = false)
})
//@ComponentScan(value = "com.humin",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class,Service.class})
//},useDefaultFilters = false)
//@ComponentScan value:指定要扫描的包
// excludeFilters = Filter[]:指定扫描的时候按照什么规则排除哪些组件
// includeFilters = Filter[]:指定扫面的时候只需要包含哪些组件 ,使用includeFilters的时候，要配合useDefaultFilters使用，
// 默认useDefaultFilters是true
//FilterType.ANNOTATION:按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型
//FilterType.ASPECTJ:使用ASPECTJ表达式
//FilterType.REGEX：使用正则表达式
//FilterType.CUSTOM：使用自定义规则
public class MainConfig {

    // 给容器中注册一个Bean；类型为返回值的类型，id默认是方法名作为id
    // 如果不使用默认的方法名作为id，可以使用@Bean value 来指定bean的id值
    @Bean(value = "person")
    public Person person01(){
        return new Person("lisi",12);
    }
}
