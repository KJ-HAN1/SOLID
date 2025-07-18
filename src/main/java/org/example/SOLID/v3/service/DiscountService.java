package org.example.SOLID.v3.service;

import org.example.SOLID.v3.discount.DiscountPolicy;
import org.example.SOLID.v3.domain.Customer;
import org.example.SOLID.v3.domain.Product;

public class DiscountService {
    private final DiscountPolicy discountPolicy;

    public DiscountService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public int calculatePrice(Customer customer, Product product) {
        int discountAmount = discountPolicy.discount(customer, product);
        return product.getPrice() - discountAmount;
    }
}
