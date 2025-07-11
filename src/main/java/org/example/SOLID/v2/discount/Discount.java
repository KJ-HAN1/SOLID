package org.example.SOLID.v2.discount;

import org.example.SOLID.v2.model.Product;

public interface Discount {
    int discount(Product product);

    // ISP 위반 예시 -> 인터페이스 분리를 하지 않아 하위 구현체가 불필요한 내용까지 구현하게 됨
//    int discountRate();
//    int discountPeriod();
//
}
