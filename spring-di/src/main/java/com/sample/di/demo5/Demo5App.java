package com.sample.di.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo5App {

	public static void main(String[] args) {
		
		String resouce = "classpath:/com/sample/di/demo5/demo5.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resouce);
		
		UserService service = ctx.getBean("user",UserService.class);
		
		service.addNewUser("¿Ã¡ˆπŒ", "lee", "233");
	}
}
