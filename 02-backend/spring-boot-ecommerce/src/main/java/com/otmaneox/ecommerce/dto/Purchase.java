package com.otmaneox.ecommerce.dto;

import com.otmaneox.ecommerce.entity.Address;
import com.otmaneox.ecommerce.entity.Customer;
import com.otmaneox.ecommerce.entity.Order;
import com.otmaneox.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
