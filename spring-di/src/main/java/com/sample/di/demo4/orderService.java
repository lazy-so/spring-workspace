package com.sample.di.demo4;

public class orderService {

	private Messenger messenger;
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}

	public void sendOrderStatus() {
		messenger.sendMessage("010-1111-1111", "�߼��غ���..");
	}
}
