package com.sample.di.demo3;

import java.util.Scanner;

public class SampleController {

	private SampleDao sampleDao;

	public void setSampleDao(SampleDao sampleDao) {
		this.sampleDao = sampleDao;
	}
	
	public void print() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 입력:");
		String id = scanner.next();
		
		System.out.print("비밀번호 입력:");
		String password = scanner.next();

		add(id,password);
	}
	public void add(String id, String password) {
			// 등록작업
		sampleDao.insert(id, password);
		
	}
}


