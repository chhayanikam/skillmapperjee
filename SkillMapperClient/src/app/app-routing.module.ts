import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ListusersComponent } from './listusers/listusers.component';
import { SearchskillComponent } from './searchskill/searchskill.component';
import { ApproveprofileComponent } from './approveprofile/approveprofile.component';
import { ApprofileComponent } from './approfile/approfile.component';
import { DeleteEmployeeComponent } from './delete-employee/delete-employee.component';

const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'listusers', component: ListusersComponent },
  { path: 'searchskill', component: SearchskillComponent },
  { path: 'approfile', component: ApprofileComponent },
  { path: 'approveprofile', component: ApproveprofileComponent },
  { path: 'deleteemployee', component: DeleteEmployeeComponent }
];
 
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }

