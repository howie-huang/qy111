package com.exam.qy111;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.exam.qy111.mapper")
public class Qy111Application {

	public static void main(String[] args) {
		SpringApplication.run(Qy111Application.class, args);
	}

}
