package com.exam.qy111.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.exam.qy111.entity.Book;
import com.exam.qy111.service.BookService;
import com.exam.qy111.util.LayUIData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-09
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/select")
    @ResponseBody
    public LayUIData selectAll(int page,int limit){
        Page<Book> pages = new Page(page,limit);
        int pageNum = bookService.selectCount(null);
        Page<Book> bookPage = bookService.selectPage(pages);
        List<Book> bookList = bookPage.getRecords();
        LayUIData layUIData = new LayUIData();
        layUIData.setCode(0);
        layUIData.setMessage("操作成功");
        layUIData.setCount(pageNum);
        layUIData.setData(bookList);
        return layUIData;
    }
}

