package org.example.SOLID.v1.isp;

public class Leesin implements champion, jungle {
    @Override
    public void attack() {
        System.out.println("attack!");
    }
    @Override
    public void smite() {
        System.out.println("use smite");
    }
}
