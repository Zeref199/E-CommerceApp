package com.otmaneox.ecommerce.service;

import com.otmaneox.ecommerce.dto.PaymentInfo;
import com.otmaneox.ecommerce.dto.Purchase;
import com.otmaneox.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
