import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuyerPurchaseHistoryComponent } from './buyer-purchase-history.component';

describe('BuyerPurchaseHistoryComponent', () => {
  let component: BuyerPurchaseHistoryComponent;
  let fixture: ComponentFixture<BuyerPurchaseHistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuyerPurchaseHistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuyerPurchaseHistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
