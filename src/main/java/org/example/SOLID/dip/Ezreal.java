package org.example.SOLID.dip;

public class Ezreal implements Dip{

    @Override
    public void move() {
        System.out.println("Ezreal move");
    }

    @Override
    public void attack() {
        System.out.println("Ezreal attack");
    }

    @Override
    public void skill(String skill) {
        switch (skill) {
            case "q":
                System.out.println("q skill");
                break;
            case "w":
                System.out.println("w skill");
                break;
            case "e":
                System.out.println("e skill");
                break;
            case "r":
                System.out.println("r skill");
                break;
            default:
                System.out.println("unknown skill");
        }
    }
}
