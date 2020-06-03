package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		//执行main方法 将带有@SpringBootApplication注解的类字节码对象作为参数传递即可
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
