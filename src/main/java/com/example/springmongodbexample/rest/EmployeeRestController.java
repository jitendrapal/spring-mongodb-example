package com.example.springmongodbexample.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmongodbexample.document.Employee;
import com.example.springmongodbexample.repository.EmployeeRepository;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping(value = "/getall")
	public List<Employee> getData() {
		return employeeRepository.findAll();
	}

	@RequestMapping(value="/savedata")
	public void setData()
	{
		Employee emp=new Employee(1, "Rob", "Amsterdam");
		Employee emp1=new Employee(2, "Peter", "Amsterdam");
		Employee emp2=new Employee(3, "Alex", "Amsterdam");
		Employee emp3=new Employee(4, "Jhon", "Amsterdam");
		Employee emp4=new Employee(5, "Marteen", "Amsterdam");
		
		List<Employee> employeelist=new ArrayList<>();
		employeelist.add(emp);
		employeelist.add(emp1);
		employeelist.add(emp2);
		employeelist.add(emp3);
		employeelist.add(emp4);
		employeelist.stream().forEach(e->employeeRepository.save(e));
		
	}

}
