package org.example.SOLID.v2.discount;

import org.example.SOLID.v2.model.Product;

public class ErrorLSP implements Discount {
    @Override
    public int discount(Product product) {
        return product.getPrice()*-9;
    }
}
