package com.humin.bean;

import javafx.fxml.Initializable;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:09/07/20181:47 AM
 */
@Component
public class Cat implements InitializingBean,DisposableBean {

    public Cat(){
        System.out.println("cat...contructor...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("cat...destory...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat...afterPropertiesSet...");
    }
}
