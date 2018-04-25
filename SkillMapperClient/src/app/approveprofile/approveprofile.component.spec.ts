import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApproveprofileComponent } from './approveprofile.component';

describe('ApproveprofileComponent', () => {
  let component: ApproveprofileComponent;
  let fixture: ComponentFixture<ApproveprofileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApproveprofileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApproveprofileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
