package kr.co.jhta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.dao.DepartmentDao;
import kr.co.jhta.dao.EmployeeDao;
import kr.co.jhta.vo.Department;
import kr.co.jhta.vo.Employee;

@Controller
@RequestMapping(value = "/emp")
public class EmployeeController {
	
	@Autowired
	private DepartmentDao deptDao;
	@Autowired
	private EmployeeDao empDao;

	@RequestMapping(value = "/dept.do")
	public String dept(Model model) {
		
		List<Department> dept =  deptDao.getAllDepartments();
		model.addAttribute("dept",dept);
		
		return "emp/depts";
	}
	
	@RequestMapping(value = "/employees.do")
	public String employees(int deptid , Model model) {
		
			List<Employee> emp =  empDao.getEmpByIdDept(deptid);
			model.addAttribute("emp",emp);
			
			return "emp/employees";
	}
	@RequestMapping(value = "/employee.do")
	public String employee(String empid, Model model) {
		
		Employee employee = empDao.getEmpById(empid);
		model.addAttribute("employee",employee);
		return "emp/employee";
	}
	
	@RequestMapping(value = "/form.do")
	public String form() {
		
		return "emp/form";
	}
}
