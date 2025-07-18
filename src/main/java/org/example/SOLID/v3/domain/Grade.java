package org.example.SOLID.v3.domain;

public enum Grade {
    GOLD(0.1),
    SILVER(0.05),
    BRONZE(0.02),
    NONE(0.0);

    private final double discountRate;

    Grade(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
