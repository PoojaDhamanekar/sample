package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeCrudRepo;

@Service

public class EmployeeService implements EmployeeServiceInterface {
	
	
	@Autowired
	private EmployeeCrudRepo employeecrudrepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedemployee=employeecrudrepo.save(employee);
		return savedemployee;
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeecrudrepo.findAll();
		
	}

	@Override
	public Employee getByID(Long empidL) {
		
		return employeecrudrepo.findById(empidL).get();
	}

	@Override
	public void deleteByid(Long empidL) {
	 employeecrudrepo.deleteById(empidL);
		
	}

}
