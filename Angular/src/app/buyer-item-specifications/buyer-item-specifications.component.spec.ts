import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuyerItemSpecificationsComponent } from './buyer-item-specifications.component';

describe('BuyerItemSpecificationsComponent', () => {
  let component: BuyerItemSpecificationsComponent;
  let fixture: ComponentFixture<BuyerItemSpecificationsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuyerItemSpecificationsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuyerItemSpecificationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
