package kr.co.jhta.app;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.dao.CustomerDao;
import kr.co.jhta.vo.Customer;

public class CustomerApp {
	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);

		CustomerDao customerDao = ctx.getBean(CustomerDao.class);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n");
			System.out.println("------------------------------------------------------");
			System.out.println("1.전체조회 2.검색 3.키워드 검색 4.수정 5.삭제 6.등록 0.종료");
			System.out.println("------------------------------------------------------");
			
			System.out.print("메뉴선택> ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				List<Customer> cust = customerDao.getAllCustomer();
				for(Customer c : cust) {
					System.out.println("고객 번호: "+c.getNo());
					System.out.println("고객 이름: "+c.getName());
					System.out.println("고객 닉네임: "+c.getNickname());
					System.out.println("전화 번호: "+c.getTel());
					System.out.println("이 메 일: "+c.getEmail());
					System.out.println("거 주 지: "+c.getAddr());
					System.out.println("적립포인트: "+c.getPoint());
					System.out.println("등 록 일: "+c.getCreateDate());
				}
			} else if (menu == 2) {
				System.out.println("검색할 고객번호를 입력해주세요.");
				int no = scanner.nextInt();
				Customer c = customerDao.getCusByNo(no);
				System.out.println("고객 번호: "+c.getNo());
				System.out.println("고객 이름: "+c.getName());
				System.out.println("고객 닉네임: "+c.getNickname());
				System.out.println("전화 번호: "+c.getTel());
				System.out.println("이 메 일: "+c.getEmail());
				System.out.println("거 주 지: "+c.getAddr());
				System.out.println("적립포인트: "+c.getPoint());
				System.out.println("등 록 일: "+c.getCreateDate());
				
			} else if (menu == 3) {
				System.out.println("1.번호  / 2. 이름  / 3. 닉네임");
				int no = scanner.nextInt();
				
				HashMap<String, Object> map = new HashMap<String, Object>();
				if(no == 1) {
					System.out.println("번호를 입력하세요");
					int keyNO = scanner.nextInt();
					map.put("keyword", "1");
					map.put("val",keyNO);
				} else if(no == 2) {
					System.out.println("이름을 입력하세요");
					String keyName = scanner.next();
					map.put("keyword", "2");
					map.put("val",keyName);
				}else if(no == 3) {
					System.out.println("닉네임을 입력하세요");
					String keyNick = scanner.next();
					map.put("keyword", "3");
					map.put("val",keyNick);
				}	
				List<Customer> cu = customerDao.getInfoCustomer(map);
				
				for(Customer c : cu ) {
					System.out.println("고객 번호: "+c.getNo());
					System.out.println("고객 이름: "+c.getName());
					System.out.println("고객 닉네임: "+c.getNickname());
					System.out.println("전화 번호: "+c.getTel());
					System.out.println("이 메 일: "+c.getEmail());
					System.out.println("거 주 지: "+c.getAddr());
					System.out.println("적립포인트: "+c.getPoint());
					System.out.println("등 록 일: "+c.getCreateDate());
			}
				
				
			} else if (menu == 4) {
				
				
			} else if (menu == 5) {
				
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
	}
}	
