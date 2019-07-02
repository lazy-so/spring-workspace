package kr.co.jhta.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	/*
	 *      /home.do url 요청이 오면 실행되는 요청 핸들러 메소드 정의 
	 *			- "/home.do url 요청이 접수되면 home()이 실행된다.
	 *			- home()이 반환하는 문자열이 이동할 JSP 페이지의 이름이다.
	 *			- spring mvc 프레임워크는 요청 핸들러 메소드가 반환하는
	 *			  문자열을 JSP의 이름으로 간주하고, 해당 JSP 페이지로 요청을 이동시킨다.
	 *			- 요청을 받은 JSP의 실행결과로 생성한 HTML 컨텐츠가 응답으로 제공된다. 
	 */
	
	@RequestMapping(value = "/home.do")
	public String home(Model model) {
		// 응답 String인 경우 이동할 jsp를 적어준다.
		// 전해줄 값을 전달할땐 Model이라는 매개변수를 적자.
		
		model.addAttribute("message","홈페이지가 새로 개편되었습니다.");
		List<String> notices = Arrays.asList("에이치엘비","박효신","조은희","사주논리 여행","이엘");
		model.addAttribute("rankings",notices);
		return "main";  // jsp 안적어도 된다.
	}
	
@RequestMapping(value = "/about.do")
public String about() {
		
		return "about";
	}
}
