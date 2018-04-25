package com.niit.skillmapper.service;
import java.util.List;

import com.niit.skillmapper.model.*;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int empId);
	public Employee findByName(String name);
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(int empId);

}
