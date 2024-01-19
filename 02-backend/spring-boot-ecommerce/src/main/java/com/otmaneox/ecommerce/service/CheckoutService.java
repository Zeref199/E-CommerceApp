package com.otmaneox.ecommerce.service;

import com.otmaneox.ecommerce.dto.Purchase;
import com.otmaneox.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
