package com.humin.dao;

import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:05/07/20184:26 PM
 */
@Repository
public class BookDao {

    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "label='" + label + '\'' +
                '}';
    }
}
