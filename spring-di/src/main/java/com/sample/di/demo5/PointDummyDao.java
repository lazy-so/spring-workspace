package com.sample.di.demo5;

public class PointDummyDao implements PointDao {
	
	public void updatePoint(String id, int point) {
		System.out.println(id+" 에 포인트"+point+" 이 지급되었습니다.");
	}
	
}
