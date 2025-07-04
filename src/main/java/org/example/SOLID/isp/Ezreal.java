package org.example.SOLID.isp;

public class Ezreal implements champion,ad{
    @Override
    public void attack() {
        System.out.println("attack!");
    }

    @Override
    public void heal() {
        System.out.println("use heal");
    }
}
