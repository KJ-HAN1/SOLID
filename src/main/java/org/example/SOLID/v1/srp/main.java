/*
*   SRP에서는 각각의 클래스의 책임은 하나로 분리
*   챔피언은 챔피언의 이동과 공격->행위에 대한 책임만
*   아이템 구매에 관해서는 Item 클래스가 아이템 관련 행위의 책임만 가지도록 설계
*
*/
package org.example.SOLID.v1.srp;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Champion champion = new Champion();
        Item item = new Item();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the name of the item: ");
        String name = scanner.nextLine();

        item.getItem(name);
    }
}
