import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BuyerLoginComponent } from './buyer-login/buyer-login.component';
import { BuyerItemSearchComponent } from './buyer-item-search/buyer-item-search.component';
import { BuyerItemSearchResultComponent } from './buyer-item-search-result/buyer-item-search-result.component';
import { BuyerItemSpecificationsComponent } from './buyer-item-specifications/buyer-item-specifications.component';
import { BuyerShoppingCartComponent } from './buyer-shopping-cart/buyer-shopping-cart.component';
import { BuyerPurchaseHistoryComponent } from './buyer-purchase-history/buyer-purchase-history.component';
import { SellerLoginComponent } from './seller-login/seller-login.component';
import { SellerMainComponent } from './seller-main/seller-main.component';
import { SellerAddItemComponent } from './seller-add-item/seller-add-item.component';
import { SellerInventoryComponent } from './seller-inventory/seller-inventory.component';
import { SellerReportComponent } from './seller-report/seller-report.component';
import { SellerTaxCalculationComponent } from './seller-tax-calculation/seller-tax-calculation.component';

@NgModule({
  declarations: [
    AppComponent,
    BuyerLoginComponent,
    BuyerItemSearchComponent,
    BuyerItemSearchResultComponent,
    BuyerItemSpecificationsComponent,
    BuyerShoppingCartComponent,
    BuyerPurchaseHistoryComponent,
    SellerLoginComponent,
    SellerMainComponent,
    SellerAddItemComponent,
    SellerInventoryComponent,
    SellerReportComponent,
    SellerTaxCalculationComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    RouterModule.forRoot([
      { path: 'products', component: BuyerLoginComponent },
      { path: 'cart', component: BuyerShoppingCartComponent },
      { path: 'products/:productId', component: BuyerItemSearchResultComponent },
      { path: 'buyerlogin', component: BuyerLoginComponent },
  ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
