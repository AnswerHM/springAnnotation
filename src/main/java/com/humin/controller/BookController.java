package com.humin.controller;

import com.humin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:05/07/20184:25 PM
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
}
