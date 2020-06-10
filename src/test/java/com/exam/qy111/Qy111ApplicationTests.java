package com.exam.qy111;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.exam.qy111.entity.Book;
import com.exam.qy111.service.BookService;
import com.exam.qy111.util.BaseUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootTest
class Qy111ApplicationTests {

	@Autowired
	private BookService service;
	@Test
	void contextLoads() {
		//查询id为5的书籍信息
		Wrapper<Book> wrapper = new EntityWrapper<>();
		wrapper.eq("id","5");
		System.out.println(service.selectList(wrapper));
	}
	@Test
	void selectAll(){
		/*
		1、查询全部
		2、排序查询
		3、分页查询
		4、模糊查询
		 */
		Wrapper wrapper = new EntityWrapper();
		//wrapper.orderBy("id",true);
		wrapper.like("title","语言");
		Page<Book> page = new Page(1,3);
		Page<Book> bookPage = service.selectPage(page);
		//List<Book> list = service.selectList(null);
		List<Book> list = service.selectList(wrapper);
		//List<Book> list = service.selectPage(wrapper);
		//List<Book> list = bookPage.getRecords();
		for (Book book:list){
			System.out.println(book);
		}
	}

	/**
	 * 添加
	 */
	@Test
	void insertAll(){
		try {
			Book book = new Book();
			book.setTitle("语言");
			book.setPrice(BaseUtil.doubleToBigDecimal(33.5));
			book.setPubDate(BaseUtil.stringToDate("2020-05-10"));
			book.setCateId(3);
			boolean bl =service.insert(book);
			BaseUtil.checkBoolean(bl);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * 根据id修改
	 */
	@Test
	void updateAll(){
		Book book = new Book();
		book.setId(5);
		book.setTitle("人力资源管理学");
		boolean bl = service.updateById(book);
		BaseUtil.checkBoolean(bl);
	}

	/**
	 * 删除
	 */
	@Test
	void deleteAll(){
		Book book = new Book();
		book.setId(7);
		boolean bl = service.deleteById(book);
		BaseUtil.checkBoolean(bl);
	}
}
