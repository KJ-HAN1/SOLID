package org.example.SOLID.v2.discount;

import org.example.SOLID.v2.model.Product;

public class SilverDiscount implements Discount {
    @Override
    public int discount(Product product) {
        return product.getPrice() / 5;
    }
}
