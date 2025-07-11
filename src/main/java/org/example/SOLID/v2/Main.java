package org.example.SOLID.v2;

import org.example.SOLID.v2.discount.ErrorLSP;
import org.example.SOLID.v2.discount.GoldDiscount;
import org.example.SOLID.v2.discount.SilverDiscount;
import org.example.SOLID.v2.model.Product;
import org.example.SOLID.v2.model.User;
import org.example.SOLID.v2.service.PurchaseService;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("맥북",2000000);

        // LSP -> User의 3번째 매개변수인 discount를 silver/gold로 바꿔도 정상적으로 동작함
        User silverUser = new User("고객1",20, new SilverDiscount());
        User goldUser = new User("고객2", 30, new GoldDiscount());

        // LSP 위반 -> 기능은 동작하지만 예상된 결과(할인된 가격) 이 나오지 않고 기본 상품 가격보다 더 많은 가격이 나옴
        // --> 코드가 원래 의도(할인)대로 동작하지 않음
        User errorLSP = new User("error", 30, new ErrorLSP());


        PurchaseService purchaseService = new PurchaseService();

        System.out.println(silverUser.getName()+" 구매 금액 : "+purchaseService.calculatePrice(silverUser, product));
        System.out.println(goldUser.getName()+" 구매 금액 : "+purchaseService.calculatePrice(goldUser, product));
        System.out.println(errorLSP.getName()+" 구매 금액 : "+purchaseService.calculatePrice(errorLSP, product));
    }
}
