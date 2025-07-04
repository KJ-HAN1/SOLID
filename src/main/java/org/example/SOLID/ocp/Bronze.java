/*
 *   ocp 구현체로 추가 기능을 기존 코드 변경없이 구현체에 추가 가능
 *
 *
 */
package org.example.SOLID.ocp;

public class Bronze implements Ocp {

    @Override
    public double Price(int basicPrice) {
        return basicPrice * 1.1;
    }
}