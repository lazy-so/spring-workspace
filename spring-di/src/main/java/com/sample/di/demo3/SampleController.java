package com.sample.di.demo3;

import java.util.Scanner;

public class SampleController {

	private SampleDao sampleDao;

	public void setSampleDao(SampleDao sampleDao) {
		this.sampleDao = sampleDao;
	}
	
	public void print() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̵� �Է�:");
		String id = scanner.next();
		
		System.out.print("��й�ȣ �Է�:");
		String password = scanner.next();

		add(id,password);
	}
	public void add(String id, String password) {
			// ����۾�
		sampleDao.insert(id, password);
		
	}
}


