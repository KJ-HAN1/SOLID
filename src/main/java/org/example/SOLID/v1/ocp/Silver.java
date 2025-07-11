/*
 *   ocp 구현체로 추가 기능을 기존 코드 변경없이 구현체에 추가 가능
 *
 *      새로운 티어 -> 골드 플레티넘 ... 생기더라도 기존코드는 유지하고 확장만 해나가면 됨
 */
package org.example.SOLID.v1.ocp;

public class Silver implements Ocp{
    @Override
    public double Price(int basicPrice) {
        return basicPrice * 1.5;
    }
}
