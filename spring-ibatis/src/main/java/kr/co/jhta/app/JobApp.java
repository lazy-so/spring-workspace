package kr.co.jhta.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.dao.JobDao;
import kr.co.jhta.vo.Job;

public class JobApp {
	
	public static void main(String[] args) {
		
		String resouce = "classpath:/META-INF/spring/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(resouce);
		
		JobDao jobDao = context.getBean(JobDao.class);
		
	 Job job = jobDao.getJobById("IT_PROG");
		System.out.println(job.getId());
		System.out.println(job.getTitle());
		System.out.println(job.getMinSalary());
		System.out.println(job.getMaxSalary());
		
		System.out.println();
		
		List<Job> jobs = jobDao.getAllJobs();
		for(Job j : jobs) {
			System.out.println("아이디 : "+j.getId());
			System.out.println("제  목 : "+j.getTitle());
			System.out.println("최소급여 : "+j.getMinSalary());
			System.out.println("최대급여 : "+j.getMaxSalary());
			System.out.println("--------------------------------");
		}
	}
}
