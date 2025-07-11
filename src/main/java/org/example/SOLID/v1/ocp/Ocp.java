/*
*   기존 코드 ocp를 구현한 ocpimpl에서는 기존 코드를 수정하지 않고 추가 기능을 구현
*   ex) 티어별로 상금을 지급하는 로직이 있다면 새로운 티어가 나오더라도 기존 코드는 유지 가능
*
*/

package org.example.SOLID.v1.ocp;

public interface Ocp {
    double Price(int basicPrice);
}