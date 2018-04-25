package com.niit.skillmapper.dao;

import java.util.List;

import com.niit.skillmapper.model.Employee;

public interface EmployeeDAO {

	public List<Employee> ListAllEmployee();
	public Employee findById(int empId);
	public Employee findByName(String name);
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(int empId);
}
