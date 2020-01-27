package org.example;

public abstract class Duck {
    public void quack() {
        System.out.println("QUACK QUACK!!!");
    }

    public void swim() {
        System.out.println("DUCK SWIMMING!!!");
    }

    public abstract void display();
}
