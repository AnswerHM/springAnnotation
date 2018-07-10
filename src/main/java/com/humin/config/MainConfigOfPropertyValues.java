package com.humin.config;

import com.humin.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:10/07/20182:22 PM
 */
// 使用PropertySource读取外部配置文件中的k/v保存到运行的环境变量中；加载完外部的配置文件以后使用${}取出配置文件的值。
@PropertySource(value={"classpath:/person.properties"})
@Configuration
public class MainConfigOfPropertyValues {
    @Bean
    public Person person(){
        return new Person();
    }
}
