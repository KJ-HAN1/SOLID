package org.example.SOLID.v3.discount;

import org.example.SOLID.v3.domain.Customer;
import org.example.SOLID.v3.domain.Product;

public class CouponPolicy implements DiscountPolicy {
    private final int couponAmount;

    public CouponPolicy(int couponAmount) {
        this.couponAmount = couponAmount;
    }

    @Override
    public int discount(Customer customer, Product product) {
        return couponAmount;
    }

}
