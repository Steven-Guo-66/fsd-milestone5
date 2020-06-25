import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SellerTaxCalculationComponent } from './seller-tax-calculation.component';

describe('SellerTaxCalculationComponent', () => {
  let component: SellerTaxCalculationComponent;
  let fixture: ComponentFixture<SellerTaxCalculationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SellerTaxCalculationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SellerTaxCalculationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
