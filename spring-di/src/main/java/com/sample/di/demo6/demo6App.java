package com.sample.di.demo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo6App {

	public static void main(String[] args) {
		
		String resouce = "classpath:/com/sample/di/demo6/demo6.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resouce);
		
		MessageService service = ctx.getBean("messageservice2",MessageService.class);
		
		
	}
}
