package test.java.com.niit.skillmapperbackend;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;
import com.niit.skillmapper.config.AppContext;
import com.niit.skillmapper.model.Employee;
import com.niit.skillmapper.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)// this will repalce writing the code in setUp method
public class EmployeeTest {

	@Autowired
	private EmployeeService employeeService;

	@Test
	public void testListEMployee() {			
		assertEquals("failed to fetch the records",4, employeeService.findAll().size());				
	}
		
	@Test
	public void testAddEmployee() {
		
		Employee emp=new Employee();
		emp.setEmployeeId(103);
		emp.setEmail("chhaya@gmal.com");
		emp.setEmpPassword("test");
		emp.setDeptname("ceb");
		emp.setRole_type("Trainer");
		emp.setEmployeeName("chhaya");		
		assertEquals("Failed to insert Employee",true, employeeService.addEmployee(emp));				
	}
	
	@Ignore
	@Test
	public void testupdateUser() {		
		Employee euser=new Employee();		
		euser.setEmployeeName("Riyanew");
		euser.setDeptname("CEBnew");
		euser.setEmail("riya@niit.com");
		euser.setRole_type("Trainer1");
		euser.setEmpPassword("password1@123");
		assertEquals("Failed to update the user!", true, employeeService.updateEmployee(euser));
	}


}
