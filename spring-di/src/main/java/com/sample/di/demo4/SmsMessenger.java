package com.sample.di.demo4;

public class SmsMessenger implements Messenger {

		public void sendMessage(String to, String text) {
			System.out.println("�޴� ��� ��ȭ��ȣ :" + to);
			System.out.println("SMS �ܹ� �޽��� ������ :" + text);
		}
		
		public String receiveMessage() {
			System.out.println("SMS �ܹ� �޼��� �ޱ�");
			return "�ȳ��ϼ���";
		}
}
