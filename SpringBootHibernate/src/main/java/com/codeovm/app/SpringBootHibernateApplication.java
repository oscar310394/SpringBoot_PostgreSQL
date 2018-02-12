package com.codeovm.app;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codeovm.app.dao.EmployeeDAO;
import com.codeovm.app.entities.Employee;

@SpringBootApplication
public class SpringBootHibernateApplication implements CommandLineRunner{

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Employee employee = getEmployee();
		employeeDAO.createEmployee(employee);
		
	}
	
	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setName("Sean Murphy");
		employee.setSalary(8000.00);
		employee.setDoj(new Date());
		
		return employee;
	}
}
