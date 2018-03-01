package org.sunny.meng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("org.sunny.meng.mapper")
public class MengApplication {

	public static void main(String[] args) {
		SpringApplication.run(MengApplication.class, args);
	}
}
