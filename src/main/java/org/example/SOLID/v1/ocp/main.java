/*
*  OCP 의 원칙을 기반으로 기존코드를 수정하지 않고도 새로운 티어가 나오게 된다면
* 새로운 티어의 구현체만 추가적으로 만들어서 확장 가능
* 기존 코드의 변경 X
*
*/

package org.example.SOLID.v1.ocp;

public class main {
    public static void main(String[] args) {
        Bronze bronze = new Bronze();
        Silver silver = new Silver();

        int price = 10000;

        System.out.println("bronze price : " + bronze.Price(price));
        System.out.println("silver price : " + silver.Price(price));
    }
}
