/*
*   각각 라이너에 맞게 분리된 인터페이스를 구현하여 원딜은 공격과 힐
*   미드는 공격과 점화
*   정글은 공격과 스마를 사용할 수 있도록 각 구현체가 필요한 기능만 구현할 수 있도록 인터페이스를 분리
*
*/
package org.example.SOLID.isp;

public class main {
    public static void main(String[] args) {
        Ezreal ezreal = new Ezreal();
        Zed zed = new Zed();
        Leesin leesin = new Leesin();

        ezreal.attack();
        ezreal.heal();

        zed.attack();
        zed.ignite();

        leesin.attack();
        leesin.smite();
    }
}
