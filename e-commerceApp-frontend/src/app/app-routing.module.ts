import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductComponent } from './component/products/product/product.component';
import { ProductsComponent } from './component/products/products.component';
import { ShoppingcartComponent } from './shoppingcart/shoppingcart.component';

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'dashboard', component: ProductsComponent },
  { path: 'detail/:id', component: ProductComponent},
  { path: 'category/:name', component: ProductsComponent },
  { path: 'products', component: ProductsComponent },
  { path: 'communication', component: ProductsComponent },
  { path: 'basket', component: ProductsComponent },
  { path: 'shoppingCart', component: ShoppingcartComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes), CommonModule],
  exports: [RouterModule]
})
export class AppRoutingModule { 
  
}
