package org.example;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("Display Redhead Duck");
    }

    @Override
    public void fly() {
        System.out.println("Fly Redhead Duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack Redhead Duck");
    }
}
