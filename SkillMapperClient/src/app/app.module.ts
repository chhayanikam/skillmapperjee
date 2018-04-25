import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AppRoutingModule } from './/app-routing.module';
import { SearchskillComponent } from './searchskill/searchskill.component';
import { ApproveprofileComponent } from './approveprofile/approveprofile.component';
import { ApprofileComponent } from './approfile/approfile.component';
import { HttpClientModule} from '@angular/common/http'; // step 1
import { EmployeeService} from './employee.service';
import { MessageComponent } from './message/message.component';
import { DeleteEmployeeComponent } from './delete-employee/delete-employee.component'
import {ListusersComponent} from './listusers/listusers.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    ListusersComponent,
    SearchskillComponent,
    ApproveprofileComponent,
    ApprofileComponent,
    MessageComponent,
    DeleteEmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule // step2
  ],
  providers: [EmployeeService],
  bootstrap:[AppComponent]
})
export class AppModule { }
