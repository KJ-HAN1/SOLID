package org.example.SOLID.v1.isp;

public class Zed implements champion, mid{
    @Override
    public void attack() {
        System.out.println("attack!");
    }

    @Override
    public void ignite() {
        System.out.println("use ignite");
    }
}
