package org.example.SOLID.v2.model;

import org.example.SOLID.v2.discount.Discount;
import org.example.SOLID.v2.discount.SilverDiscount;

public class User {
    //SRP -> USER에 대한내용만 가지고 있어야함
    private String name;
    private int age;
    //구현체가 아닌 추상화에 의존 -> DIP
    private Discount discount;

    public User(String name, int age, Discount discount) {
        this.name = name;
        this.age = age;
        this.discount = discount;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public Discount getDiscount() { return discount; }

//    DIP위반 예시 -> User가 할인 인터페이스 구현체인 silverDiscount를 직접 의존
//    private SilverDiscount silverDiscount = new SilverDiscount();
//
//    public int calculateDiscount(Product product) {
//        return silverDiscount.discount(product);
//    }
}
