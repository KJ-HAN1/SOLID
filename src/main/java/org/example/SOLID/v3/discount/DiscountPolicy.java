package org.example.SOLID.v3.discount;

import org.example.SOLID.v3.domain.Customer;
import org.example.SOLID.v3.domain.Product;

public interface DiscountPolicy {
    int discount(Customer customer, Product product);
}
