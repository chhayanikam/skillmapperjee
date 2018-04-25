import { TestBed, inject } from '@angular/core/testing';

import { MesssageService } from './messsage.service';

describe('MesssageService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [MesssageService]
    });
  });

  it('should be created', inject([MesssageService], (service: MesssageService) => {
    expect(service).toBeTruthy();
  }));
});
