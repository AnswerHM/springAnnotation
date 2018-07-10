package com.humin.condition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:07/07/201811:44 PM
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * Register bean definitions as necessary based on the given annotation metadata of
     * the importing {@code @Configuration} class.
     * <p>Note that {@link BeanDefinitionRegistryPostProcessor} types may <em>not</em> be
     * registered here, due to lifecycle constraints related to {@code @Configuration}
     * class processing.
     *
     * @param importingClassMetadata annotation metadata of the importing class
     * @param registry               current bean definition registry
     */
    /**
     *
     *  AnnotationMetadata:当前类的注解信息
     *  BeanDefinition：BeanDefinition注册类：
     *          把所有需要添加到容器中的bean；调用BeanDefinitionRegistry.registerBeanDefinition手工注册进来
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("com.humin.bean.Red");
        boolean blue = registry.containsBeanDefinition("com.humin.bean.Blue");
        if(red && blue){
            // 指定Bean定义信息；（Bean的类型，Bean的Scope等。。。。。。）
            RootBeanDefinition beanDefinition = new RootBeanDefinition("com.humin.bean.RainBow");
            // 注册一个bean，指定bean名字
            registry.registerBeanDefinition("rainBow",beanDefinition);

        }

    }
}
