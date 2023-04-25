package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/code")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	@PostMapping("/save")
	public ResponseEntity<Employee>addEmployee(@RequestBody Employee employee){
		Employee employeesaved=employeeServiceInterface.addEmployee(employee);
		return new ResponseEntity<Employee>(employeesaved,HttpStatus.CREATED);
		}
		
		
	@GetMapping("/all")
	public ResponseEntity<List<Employee>>getAllEmployee(){
	List<Employee>listofemployee=employeeServiceInterface.getAllEmployee(); 
	return new ResponseEntity<List<Employee>>(listofemployee,HttpStatus.OK);
	
	}
	
	@GetMapping("/emp/{empid}")
	public ResponseEntity<Employee>getById(@PathVariable("empid")Long empidL){
		Employee getEmpretr=employeeServiceInterface.getByID(empidL);
		return new ResponseEntity<Employee>(getEmpretr,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/emp/{empid}")
	public ResponseEntity<Void>deletebyID(@PathVariable("empid") Long empidL)
	{
		employeeServiceInterface.deleteByid(empidL);
		
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Employee>updateEmployee(@RequestBody Employee employee){
		Employee employeesaved=employeeServiceInterface.addEmployee(employee);
		return new ResponseEntity<Employee>(employeesaved,HttpStatus.CREATED);
		}
	
}
