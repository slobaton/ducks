package org.example;

public class MallardDuck extends Duck implements Flyable, Quackable{
    @Override
    public void display() {
        System.out.println("Display Mallard Duck");
    }

    @Override
    public void fly() {
        System.out.println("Fly Mallard Duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack Mallard Duck");
    }
}
