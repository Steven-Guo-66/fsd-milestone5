import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { products } from '../products';
import { CartService } from '../services/cart.service';

@Component({
  selector: 'app-buyer-item-search-result',
  templateUrl: './buyer-item-search-result.component.html',
  styleUrls: ['./buyer-item-search-result.component.css']
})
export class BuyerItemSearchResultComponent implements OnInit {
  product;
  constructor(
    private route: ActivatedRoute,
    private cartService: CartService
  ) { }

  ngOnInit(): void {
  }

  addToCart(product) {
    window.alert('Your product has been added to the cart!');
    this.cartService.addToCart(product);
  }
}
