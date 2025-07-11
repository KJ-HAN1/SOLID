/*
* 고수준 모듈인 pickArea는 저수준 모듈인 Ezreal에 의존하지 않고 Dip(인터페이스)에 의존하도록 설계
*
*
* */

package org.example.SOLID.v1.dip;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ChampionList championList = new ChampionList();
        PickArea pickArea = new PickArea(championList);
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        Dip select = pickArea.pick(name);
    }
}
