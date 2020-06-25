import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BuyerLoginComponent } from './buyer-login/buyer-login.component';
import { SellerAddItemComponent } from './seller-add-item/seller-add-item.component';
import { SellerInventoryComponent } from './seller-inventory/seller-inventory.component';
import { SellerReportComponent } from './seller-report/seller-report.component';
import { SellerTaxCalculationComponent } from './seller-tax-calculation/seller-tax-calculation.component';


const routes: Routes = [
  { path: 'buyerlogin', component: BuyerLoginComponent },
  { path: 'sellerAddItem', component: SellerAddItemComponent },
  { path: 'sellerInventory', component: SellerInventoryComponent },
  { path: 'sellerReport', component: SellerReportComponent },
  { path: 'sellerTaxCalculation', component: SellerTaxCalculationComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
