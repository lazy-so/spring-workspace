package com.sample.di.demo7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo7App {
	public static void main(String[] args) {
			
		String resouce = "classpath:/com/sample/di/demo7/demo7.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resouce);
		
		EmailService service = ctx.getBean("service", EmailService.class);
		
		service.connect();
	}
}
