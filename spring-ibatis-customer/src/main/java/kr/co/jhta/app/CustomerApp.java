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
			System.out.println("1.��ü��ȸ 2.�˻� 3.Ű���� �˻� 4.���� 5.���� 6.��� 0.����");
			System.out.println("------------------------------------------------------");
			
			System.out.print("�޴�����> ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				List<Customer> cust = customerDao.getAllCustomer();
				for(Customer c : cust) {
					System.out.println("�� ��ȣ: "+c.getNo());
					System.out.println("�� �̸�: "+c.getName());
					System.out.println("�� �г���: "+c.getNickname());
					System.out.println("��ȭ ��ȣ: "+c.getTel());
					System.out.println("�� �� ��: "+c.getEmail());
					System.out.println("�� �� ��: "+c.getAddr());
					System.out.println("��������Ʈ: "+c.getPoint());
					System.out.println("�� �� ��: "+c.getCreateDate());
				}
			} else if (menu == 2) {
				System.out.println("�˻��� ����ȣ�� �Է����ּ���.");
				int no = scanner.nextInt();
				Customer c = customerDao.getCusByNo(no);
				System.out.println("�� ��ȣ: "+c.getNo());
				System.out.println("�� �̸�: "+c.getName());
				System.out.println("�� �г���: "+c.getNickname());
				System.out.println("��ȭ ��ȣ: "+c.getTel());
				System.out.println("�� �� ��: "+c.getEmail());
				System.out.println("�� �� ��: "+c.getAddr());
				System.out.println("��������Ʈ: "+c.getPoint());
				System.out.println("�� �� ��: "+c.getCreateDate());
				
			} else if (menu == 3) {
				System.out.println("1.��ȣ  / 2. �̸�  / 3. �г���");
				int no = scanner.nextInt();
				
				HashMap<String, Object> map = new HashMap<String, Object>();
				if(no == 1) {
					System.out.println("��ȣ�� �Է��ϼ���");
					int keyNO = scanner.nextInt();
					map.put("keyword", "1");
					map.put("val",keyNO);
				} else if(no == 2) {
					System.out.println("�̸��� �Է��ϼ���");
					String keyName = scanner.next();
					map.put("keyword", "2");
					map.put("val",keyName);
				}else if(no == 3) {
					System.out.println("�г����� �Է��ϼ���");
					String keyNick = scanner.next();
					map.put("keyword", "3");
					map.put("val",keyNick);
				}	
				List<Customer> cu = customerDao.getInfoCustomer(map);
				
				for(Customer c : cu ) {
					System.out.println("�� ��ȣ: "+c.getNo());
					System.out.println("�� �̸�: "+c.getName());
					System.out.println("�� �г���: "+c.getNickname());
					System.out.println("��ȭ ��ȣ: "+c.getTel());
					System.out.println("�� �� ��: "+c.getEmail());
					System.out.println("�� �� ��: "+c.getAddr());
					System.out.println("��������Ʈ: "+c.getPoint());
					System.out.println("�� �� ��: "+c.getCreateDate());
			}
				
				
			} else if (menu == 4) {
				
				
			} else if (menu == 5) {
				
			} else if (menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
		}
	}
}	
