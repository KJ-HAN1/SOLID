package org.example.SOLID.v2.service;

import org.example.SOLID.v2.discount.SilverDiscount;
import org.example.SOLID.v2.model.Product;
import org.example.SOLID.v2.model.User;

public class PurchaseService {

    //Discount 인터페이스에만 의존 -> DIP
    public int calculatePrice(User user, Product product) {
        int discount = user.getDiscount().discount(product);
        return product.getPrice() - discount;
    }


    //DIP 위반 예시 -> Discount 인터페이스를 구현한 SilverDiscount를 직접 의존
//    public int calculateSilverDiscount(User user, Product product) {
//        SilverDiscount silverDiscount = new SilverDiscount();
//        int discount = silverDiscount.discount(product);
//        return product.getPrice() - discount;
//    }
}
