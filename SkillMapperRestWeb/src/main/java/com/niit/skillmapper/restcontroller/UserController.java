package com.niit.skillmapper.restcontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.skillmapper.model.Employee;
import com.niit.skillmapper.service.EmployeeService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/employee")  // working
public class UserController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping  //working
	public ResponseEntity<List<Employee>> listAllEmployees() {		
		return new ResponseEntity<List<Employee>>(employeeService.findAll(), HttpStatus.CREATED);
	}
	
	@GetMapping("/{empId}") // working
	public ResponseEntity<Employee> getEmployee(@PathVariable("empId") int empId) {
		
		if(employeeService.findById(empId)!=null) {
			return new ResponseEntity<Employee>(employeeService.findById(empId), HttpStatus.OK);
		}
		else 
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND); 
	}
	
	@DeleteMapping("/{empId}") 
	public ResponseEntity<Void> deleteEmployee(@PathVariable("empId") int empId) {
		
		if(employeeService.findById(empId)!=null) {
		//	employeeService.deleteEmployee());
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); 
	}
	
	@PostMapping //working through postman
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		/*if(employeeService.findByName(employee.getEmployeeName())!=null) {
			
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		else {
			employeeService.addEmployee(employee);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}*/
	}
	
	@PutMapping
	public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee) {
		
		if(employeeService.findById(employee.getEmployeeId())!=null) {
			employeeService.updateEmployee(employee);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else {
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}	

}
