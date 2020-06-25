import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuyerItemSearchResultComponent } from './buyer-item-search-result.component';

describe('BuyerItemSearchResultComponent', () => {
  let component: BuyerItemSearchResultComponent;
  let fixture: ComponentFixture<BuyerItemSearchResultComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuyerItemSearchResultComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuyerItemSearchResultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
