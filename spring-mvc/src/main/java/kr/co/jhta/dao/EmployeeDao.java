package kr.co.jhta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.vo.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	
	public List<Employee> getEmpByIdDept(int id){
		
		return template.queryForList("getEmpByIdDept",id);
	}
	
	public Employee getEmpById(String id) {
		return (Employee) template.queryForObject("getEmpById",id);
	}
}
