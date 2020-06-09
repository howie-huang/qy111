package com.exam.qy111.service.impl;

import com.exam.qy111.entity.Book;
import com.exam.qy111.mapper.BookDao;
import com.exam.qy111.service.BookService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-09
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService {

}
