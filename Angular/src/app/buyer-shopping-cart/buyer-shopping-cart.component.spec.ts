import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuyerShoppingCartComponent } from './buyer-shopping-cart.component';

describe('BuyerShoppingCartComponent', () => {
  let component: BuyerShoppingCartComponent;
  let fixture: ComponentFixture<BuyerShoppingCartComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuyerShoppingCartComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuyerShoppingCartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
