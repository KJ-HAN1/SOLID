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
    //OCP 위반 예시 -> User의 할인 등급을 String으로 입력해줬다는 가정
    // --> 새로운 등급을 추가하려면 기존 switch문을 수정해야함! OCP 위반
//    String grade = user.getgrade();
//
//    switch (grade) {
//        case "Silver":
//            discount = product.getPrice() / 10;
//            break;
//        case "Gold":
//            discount = product.getPrice() / 5;
//            break;
//        default:
//            discount = 0;
//    }

    //DIP 위반 예시 -> Discount 인터페이스를 구현한 SilverDiscount를 직접 의존
//    public int calculateSilverDiscount(User user, Product product) {
//        SilverDiscount silverDiscount = new SilverDiscount();
//        int discount = silverDiscount.discount(product);
//        return product.getPrice() - discount;
//    }
}
