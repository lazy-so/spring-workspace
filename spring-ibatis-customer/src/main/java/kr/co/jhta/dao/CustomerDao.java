package kr.co.jhta.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Customer;

public class CustomerDao {

	private SqlMapClientTemplate template;
	
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	public List<Customer> getAllCustomer() {
		return template.queryForList("getAllCustomer");
	}
	
	public Customer getCusByNo(int no) {
		return (Customer) template.queryForObject("getCusByNo",no);
	}
	
	public List<Customer> getInfoCustomer(Map<String, Object> map) {
		return template.queryForList("getInfoCustomer",map);
	}
}
