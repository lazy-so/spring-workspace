package com.sample.di.demo8;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public void deleteAllUsers() {
		System.out.println("��� ����� ����");
	}
	
	public String getPasswordById(String id) {
		System.out.println("��й�ȣ ��ȸ");
		return "zxcv1234";
	}
}
