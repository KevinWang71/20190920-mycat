package com.aaa.mycat.service;

import com.aaa.mycat.mapper.BookMapper;
import com.aaa.mycat.model.Book;
import com.aaa.mycat.statusEnum.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BookService
 * @Author wang
 * @Date 2019/9/20 20:24
 * @Version 1.0
 */
@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;
    /**
     * 根据传参是否包含id判断插入还是更新
     * @param book
     * @return
     */
    public Map<String, Object> insertBook(Book book) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        int result = bookMapper.insertSelective(book);
        if (result > 0) {
            //说明添加成功
            resultMap.put("code", StatusEnum.SUCCESS.getCode());
        } else {
            resultMap.put("code", StatusEnum.FAILED.getCode());
        }

        return resultMap;
    }
    /**
     * 查询所有图书
     * @return
     */
    public Map<String, Object> selectAllBook() {
        System.out.println("8081");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        List<Book> books = bookMapper.selectAllBook();
        if (books.size() > 0) {
            resultMap.put("code", StatusEnum.SUCCESS.getCode());
            resultMap.put("result",books);
        } else {
            resultMap.put("code", StatusEnum.FAILED.getCode());
        }
        return resultMap;
    }
}
