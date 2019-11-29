package com.db.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"com.db.demo"})
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("heyyyyyyyyyyyyyyyyy");
		SpringApplication.run(DemoApplication.class, args);
	}

}
