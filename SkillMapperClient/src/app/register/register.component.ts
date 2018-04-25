import { Component, OnInit } from '@angular/core';
import {Employee} from '../Employee';
import { EmployeeService} from '../employee.service'
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  // required for object update
  //declare a object of Employee
  employees:Employee[];
  constructor(private employeeService: EmployeeService) {   }

  ngOnInit() {
    //this.getEpmloyee();
  }

    // will be called on add button click
  add(employeeId: number,
    employeeName: string,
    email:string,
    empPassword:string,
    deptname:string,
    role_type:string): void {
       //if (!name) { return; }
       employeeId=employeeId;
       employeeName=employeeName.trim();
       email=email.trim();
       empPassword=empPassword.trim();
       deptname=deptname.trim();
       role_type=role_type.trim();

    this.employeeService.addEmployee({employeeId,employeeName,email,empPassword,deptname,role_type} as Employee)
      .subscribe(employee => {this.employees.push(employee);
      });
  }

  /*
  // method called on delete button
  delete(hero: Hero): void {
    this.heroes = this.heroes.filter(h => h !== hero);
    this.heroService.deleteHero(hero).subscribe();
  }*/
}
