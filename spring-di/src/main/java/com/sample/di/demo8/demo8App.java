package com.sample.di.demo8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo8App {

	public static void main(String[] args) {
			
		String resouce = "classpath:/com/sample/di/demo8/demo8.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resouce);
		
		LoginService service1 =ctx.getBean("loginService",LoginService.class);
		service1.login("hong", "111111");
		
	}
}
