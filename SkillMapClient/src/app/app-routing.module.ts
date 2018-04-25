import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { ProfileComponent } from './profile/profile.component';
import { SkillComponent } from './skill/skill.component';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: '/', pathMatch: 'full' },
  { path: 'listusers', component: UserComponent },
  { path: 'listprofiles', component: ProfileComponent },
  { path: 'searchskills', component: SkillComponent }
];
 
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
