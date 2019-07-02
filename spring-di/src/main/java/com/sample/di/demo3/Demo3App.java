package com.sample.di.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3App {

	public static void main(String[] args) {
		
		
		String resouce = "classpath:/com/sample/di/demo3/demo1.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resouce);
		
		SampleController sam = ctx.getBean("con",SampleController.class);
		
		sam.print();
		
	}
}
