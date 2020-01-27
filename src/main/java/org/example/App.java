package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();

        Duck redheadDuck = new MallardDuck();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.display();
    }
}
