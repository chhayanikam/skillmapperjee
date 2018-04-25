import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchskillComponent } from './searchskill.component';

describe('SearchskillComponent', () => {
  let component: SearchskillComponent;
  let fixture: ComponentFixture<SearchskillComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchskillComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchskillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
