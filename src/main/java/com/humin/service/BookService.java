package com.humin.service;

import com.humin.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:05/07/20184:25 PM
 */
@Service
public class BookService {

//    @Qualifier("bookDao")
//    @Autowired(required = false)
    @Resource
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
