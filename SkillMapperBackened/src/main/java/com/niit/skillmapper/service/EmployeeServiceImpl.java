package com.niit.skillmapper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.skillmapper.dao.EmployeeDAO;
import com.niit.skillmapper.model.*;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee findById(int empId) {
	     return employeeDAO.findById(empId);	
	}

	@Override
	public Employee findByName(String name) {
		// TODO Auto-generated method stub
		return employeeDAO.findByName(name);
	}

	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(employee);		
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		return employeeDAO.deleteEmployee(empId);
	}

	@Override
	public List<Employee> findAll() {
		return employeeDAO.ListAllEmployee();
	}
	

}
