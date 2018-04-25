import { Component, OnInit } from '@angular/core';
import {Employee} from '../Employee';
import { EmployeeService} from '../employee.service'
//import { AppRoutingModule }     from './app-routing.module';
import { RouterModule,Router, Routes } from '@angular/router';
@Component({
  selector: 'app-listusers',
  templateUrl: './listusers.component.html',
  styleUrls: ['./listusers.component.css']
})
export class ListusersComponent implements OnInit {
  data:Employee[];
  constructor(private router:Routes,private employeeService: EmployeeService) {   }
  ngOnInit() {
    console.log("In listusers");
  this.listUsers();
  }
  listUsers(): void {
    console.log("In listusers");
  this.employeeService.getEmployees().subscribe(
    data => this.data=data); 
  }

  deleteemployee(data:Employee): void {    
        // this.heroes = this.heroes.filter(h => h !== hero);
        this.data = this.data.filter(h => h !== data);
        this.employeeService.deleteEmployee(data).
        subscribe();      
      }

}
