package com.sample.di.demo8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeService {

	@Autowired
	private UserDao userdao;
	@Autowired 
	private ProductDao productdao;
}
