import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApprofileComponent } from './approfile.component';

describe('ApprofileComponent', () => {
  let component: ApprofileComponent;
  let fixture: ComponentFixture<ApprofileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApprofileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApprofileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
