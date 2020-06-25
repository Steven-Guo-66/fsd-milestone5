import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuyerItemSearchComponent } from './buyer-item-search.component';

describe('BuyerItemSearchComponent', () => {
  let component: BuyerItemSearchComponent;
  let fixture: ComponentFixture<BuyerItemSearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuyerItemSearchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuyerItemSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
