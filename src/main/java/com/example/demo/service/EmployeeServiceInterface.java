package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee);

	public List<Employee>getAllEmployee();

	public Employee getByID(Long empidL);

	public void deleteByid(Long empidL);

}
