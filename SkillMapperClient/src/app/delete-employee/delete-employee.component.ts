import { Component, OnInit } from '@angular/core';
import {Employee} from '../Employee';
import { EmployeeService} from '../employee.service'

@Component({
  selector: 'app-delete-employee',
  templateUrl: './delete-employee.component.html',
  styleUrls: ['./delete-employee.component.css']
})

export class DeleteEmployeeComponent implements OnInit {
  //employees:Employee[];
  ngOnInit() {
  }

  constructor() {   }


  
}
