package org.example.SOLID.v2.model;

public class Product {
    //SRP -> 상품은 상품에 대한 이름과 가격만 가지고 있다.
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }

//    SRP위반 예시 -> 상품 클래스에서 할인 금액 계산까지 함. 상품은 상품의 정보만 가지고 있어야 함
//    public int calculatePayment(int discount) {
//        return price - discount;
//    }
}
