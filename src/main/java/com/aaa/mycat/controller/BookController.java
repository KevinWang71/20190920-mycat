package com.aaa.mycat.controller;

import com.aaa.mycat.model.Book;
import com.aaa.mycat.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @ClassName BookController
 * @Author wang
 * @Date 2019/9/20 20:40
 * @Version 1.0
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    /**
     * 跳转到图书详情页
     * @return
     */
    @RequestMapping("/")
    private String turnAllPage() {
        return "book_all";
    }
    /**
     * 跳转到图书添加页
     * @return
     */
    @RequestMapping("/turnInsertPage")
    private String turnInsertPage() {
        return "book_insert";
    }

    /**
     * 根据传入参数是否有id判断添加还是修改
     * @param book
     * @return
     */
    @RequestMapping("/insertBook")
    private String insertBook(Book book) {
        Map<String, Object> resultMap = bookService.insertBook(book);
        if (200 == (Integer) resultMap.get("code")) {
            return "book_all";
        }
        return "404";
    }
    /**
     * 查询数据并返回详情页
     * @return
     */
    @RequestMapping("/selectAllBook")
    @ResponseBody
    private Map<String, Object> selectAllBook() {
        return bookService.selectAllBook();
    }

}
