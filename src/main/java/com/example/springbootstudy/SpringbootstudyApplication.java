package com.example.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
//@EnableHello
@RestController
@SpringBootApplication
public class SpringbootstudyApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringbootstudyApplication.class, args);
	}

}
