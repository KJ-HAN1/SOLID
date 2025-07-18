package org.example.SOLID.v3;

import org.example.SOLID.v3.discount.CouponPolicy;
import org.example.SOLID.v3.discount.DiscountPolicy;
import org.example.SOLID.v3.discount.GradeDiscountPolicy;
import org.example.SOLID.v3.domain.Customer;
import org.example.SOLID.v3.domain.Grade;
import org.example.SOLID.v3.domain.Product;
import org.example.SOLID.v3.service.DiscountService;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("홍길동", Grade.GOLD);
        Product product = new Product("맥북 프로", 3000000);

        // 할인 정책을 교체해도 서비스는 영향 없음 (OCP, DIP)
        DiscountPolicy gradePolicy = new GradeDiscountPolicy();
        DiscountService discountService = new DiscountService(gradePolicy);

        int finalPrice = discountService.calculatePrice(customer, product);
        System.out.println(customer.getName() + "님의 할인 후 가격: " + finalPrice + "원");

        DiscountPolicy couponPolicy = new CouponPolicy(100000);
        DiscountService couponService = new DiscountService(couponPolicy);

        int finalCouponPrice = couponService.calculatePrice(customer, product);
        System.out.println("쿠폰 적용 후 가격: " + finalCouponPrice + "원");
    }
}
