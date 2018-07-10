package com.humin.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:08/07/20182:06 AM
 */
// 创建一个Spring定义的FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {
    // 返回Color对象，这个对象会添加到容器中
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean....getObject");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }
    // 是单例么？
    // true:这个bean是单实例，在容器中保存一份
    // false:这是一个多实例，每次获取都会创建一个新的bean；
    @Override
    public boolean isSingleton() {
        return false;
    }
}
