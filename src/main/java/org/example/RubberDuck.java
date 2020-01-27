package org.example;

public class RubberDuck extends Duck implements Quackable{

    @Override
    public void display() {
        System.out.println("Display Rubber Duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack Rubber Duck");
    }
}
