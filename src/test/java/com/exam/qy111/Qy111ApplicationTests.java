package com.exam.qy111;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.exam.qy111.entity.Book;
import com.exam.qy111.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Qy111ApplicationTests {

	@Autowired
	private BookService service;
	@Test
	void contextLoads() {
		Wrapper<Book> wrapper = new EntityWrapper<>();
		wrapper.eq("id","5");
		System.out.println(service.selectList(wrapper));
	}

}
