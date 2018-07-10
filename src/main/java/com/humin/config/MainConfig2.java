package com.humin.config;

import com.humin.bean.Color;
import com.humin.bean.ColorFactoryBean;
import com.humin.bean.Person;
import com.humin.bean.Red;
import com.humin.condition.*;
import org.springframework.context.annotation.*;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:06/07/201812:26 AM
 */
// 类中组件统一设置。满足当前条件，这个类中配置的所有bean注册才能生效
@Conditional({MacCondition.class})
@Configuration
@Import({Red.class,Color.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
// @Import导入组件，id默认是组件的全类名
public class MainConfig2 {


    /**
     *    ConfigurableBeanFactory#SCOPE_PROTOTYPE   prototype
     * 	  ConfigurableBeanFactory#SCOPE_SINGLETON   singleton
     * 	  org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST   request
     * 	  org.springframework.web.context.WebApplicationContext#SCOPE_SESSION   session
     *  @Scope 调整作用域
     *  prototype：多实例：ioc容器启动并不会去调用方法创建对象放到容器中，
     *                    每次获取的时候才会调用方法创建对象；
     *  singleton：单实例（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。
     *              以后每次获取直接从容器（map.get()）中拿。
     *  request：同一次请求创建一个实例
     *  session：同一个session创建一个实例
     *
     *
     *  懒加载：
     *      单实例bean：默认在容器启动的时候创建对象；
     *      懒加载：容器启动的时候不创建对象，第一次使用（获取）bean创建对象，并初始化。
     *
     */
    // 默认是单实例的
//    @Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加person。。。。。。");
        return new Person("zhangsan",23);
    }


    /**
     *  @Conditional({Conditional}) :按照一定的条件进行判断，满足条件给容器中注册bean
     *
     *  如果系统是windows，给容器中注册（"bill"）
     *  如果是linux系统，给容器中注册（"linus"）
     * @return
     */
//    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01(){
        return new Person("Bill Gates",64);
    }
    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02(){
        return new Person("Linus",50);
    }
    @Conditional({MacCondition.class})
    @Bean("humin")
    public Person person03(){
        return new Person("Humin",35);
    }

    /**
     * 给容器中注册组件：
     *  1、包扫描+组件标注注解（@Controller、@Service、@Repository、@Component）【自己写的类】
     *  2、@Bean【导入的第三方包里面的组件】
     *  3、@Import【快速的给容器中导入一个组件】
     *      1)、@Import（要导入到容器中的组件）；容器中就会自动注册这个组件，id默认就是全类名
     *      2)、ImportSelector：返回需要导入的组件的全类名数组；
     *      3)、ImportBeanDefinitionRegistrar:手动注册Bean到容器中。
     *  4、使用Spring提供的FactoryBean(工厂Bean)
     *      1)、默认获取到的是工厂bean调用getObject创建的对象。
     *      2）、要获取工厂bean本身，我们需要给id前面加一个&  例如：&colorFactoryBean
     */
    @Bean
     public ColorFactoryBean colorFactoryBean(){
         return new ColorFactoryBean();
     }
}
