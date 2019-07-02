package com.sample.di.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo2App {

	public static void main(String[] args) {

		String resource = "classpath:/com/sample/di/demo2/demo2.xml";
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext(resource);
		
		GreetingService service = ctx.getBean("sr",GreetingService.class);
		String message = service.hello("ȫ�浿");
		String bye = service.bye();
		System.out.println(message);
		System.out.println(bye);
		
		
	}
}
