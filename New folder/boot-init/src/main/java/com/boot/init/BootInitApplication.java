package com.boot.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.init.beans.Motor;



@SpringBootApplication
public class BootInitApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootInitApplication.class,args);
		Motor motor = context.getBean("motor",Motor.class);
		System.out.println(motor);

	}

}
