package com.niit.skillmapper.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.skillmapper.model.Skills;
import com.niit.skillmapper.service.SkillService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/skill")
public class SkillController {
	@Autowired
	private SkillService skillService;
	
	@GetMapping
	public ResponseEntity<List<Skills>> listAllSkills() {		
		return new ResponseEntity<List<Skills>>(skillService.getAllSkills(), HttpStatus.OK);
	}
	/*
	//modify this to skillType
	@GetMapping("/{skillId}")
	public ResponseEntity<Skills> getSkill(@PathVariable("skillId") int skillId) {
		
		if(employeeService.findById(empId)!=null) {
			return new ResponseEntity<Employee>(employeeService.findById(empId), HttpStatus.OK);
		}
		else 
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND); 
	}*/
	
	
/*	@PostMapping
	public ResponseEntity<Void> addSkills(@RequestBody Skills skill) {
		
		if(skillService.findByEmployeeId(employee.getEmpId())!=null) {
			
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		else {
			skillService.add(skill);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
	}*/
	/*
	@PutMapping
	public ResponseEntity<Void> updateSkill(@RequestBody Skills skill) {
		
		if(skillService.findById(employee.getEmployeeId())!=null) {
			employeeService.updateEmployee(employee);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else {
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}	*/

	
}
