package com.spider.monitorSystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.spider.monitorSystem.dao")
@SpringBootApplication
public class MonitorSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorSystemApplication.class, args);
	}

}
