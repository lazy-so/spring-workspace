package com.sample.di.demo7;

public class EmailService {
	
	private String host;
	private int port;
	private String userid;
	private String userpwd;
	
	public void setHost(String host) {
		this.host = host;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	
	public void connect() {
		System.out.println("���� ���� ����");
		System.out.println("ȣ��Ʈ : " + host);
		System.out.println("��Ʈ��ȣ : " + port);
		System.out.println("���̵� : " + userid);
		System.out.println("��й�ȣ : " + userpwd);
	}
	
}
