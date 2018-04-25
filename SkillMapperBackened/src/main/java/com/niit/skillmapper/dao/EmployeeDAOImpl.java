package com.niit.skillmapper.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.skillmapper.model.Employee;
import com.niit.skillmapper.model.Profile;

@Repository("employeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Employee findById(int empId) {

		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where employeeId="+empId)
				.uniqueResult();	}

	@Override
	public Employee findByName(String name) {
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where name='"+name+"'")
				.uniqueResult();
	}

	@Override
	public boolean addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return true;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		sessionFactory.getCurrentSession().delete(findById(empId));	
		return true;

	}

	@Override
	public List<Employee>ListAllEmployee() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();	
		
	}
	
}
