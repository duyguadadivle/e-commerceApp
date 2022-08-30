import { ProductService } from '../services/product.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-shoppingcart',
  templateUrl: './shoppingcart.component.html',
  styleUrls: ['./shoppingcart.component.scss']
})
export class ShoppingcartComponent implements OnInit {
  products: any;
  totalPrice: number=0;
  constructor(private productService : ProductService ) { }

  ngOnInit(): void { // +1
    this.products=this.productService.getAllProducts();
    this.totalPrice=this.productService.getTotal();
    console.log(this.products);
    console.log(this.totalPrice);
  }
  
}
