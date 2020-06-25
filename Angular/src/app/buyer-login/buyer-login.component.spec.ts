import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuyerLoginComponent } from './buyer-login.component';

describe('BuyerLoginComponent', () => {
  let component: BuyerLoginComponent;
  let fixture: ComponentFixture<BuyerLoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuyerLoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuyerLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
