package com.sample.di.demo6;

public class MessageService {
	
	private Goodmoring moring;
	private Goodbye bye;
	
	public void setMoring(Goodmoring moring) {
		this.moring = moring;
	}
	public void setBye(Goodbye bye) {
		this.bye = bye;
	}
	
	public MessageService() {
		
	}
	public MessageService(Goodmoring moring , Goodbye bye) {
		this.moring = moring;
		this.bye = bye;
	}
	
	
	public void sey() {
		moring.sayHello();
		bye.sayBye();
	}
	
}
