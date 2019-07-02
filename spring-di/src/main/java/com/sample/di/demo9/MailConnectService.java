package com.sample.di.demo9;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MailConnectService {

	@Value("${mail.host}")
	private String host;
	@Value("${mail.port}")
	private int port;
	@Value("${mail.userid}")
	private String userid;
	@Value("${mail.userpassword}")
	private String userpassword;
	
	public void connect() {
		System.out.println("���� ���� ����");
		System.out.println("ȣ��Ʈ : " + host);
		System.out.println("��Ʈ��ȣ : " + port);
		System.out.println("���̵� : " + userid);
		System.out.println("��й�ȣ : " + userpassword);
	}
	
}
