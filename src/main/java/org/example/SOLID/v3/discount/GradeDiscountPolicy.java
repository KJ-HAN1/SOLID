package org.example.SOLID.v3.discount;

import org.example.SOLID.v3.domain.Customer;
import org.example.SOLID.v3.domain.Product;

public class GradeDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(Customer customer, Product product) {
        double rate = customer.getGrade().getDiscountRate();
        return (int)(product.getPrice() * rate);
    }
}
