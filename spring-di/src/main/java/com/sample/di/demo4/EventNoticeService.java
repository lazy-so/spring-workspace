package com.sample.di.demo4;

public class EventNoticeService {
		
	private Messenger messenger;
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void notice(String event) {
		messenger.sendMessage("010-1111-1111", event);
	}
}
