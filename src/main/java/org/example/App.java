package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println("**** MALLARD DUCK ****");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.fly();

        System.out.println("**** REDHEAD DUCK ****");
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.display();
        redheadDuck.fly();

        System.out.println("**** RUBBER DUCK ****");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.fly();

        System.out.println("**** Wooden Decoy Duck ****");
        Duck woodenDecoyDuck = new WoodenDecoyDuck();
        woodenDecoyDuck.quack();
        woodenDecoyDuck.swim();
        woodenDecoyDuck.display();
        woodenDecoyDuck.fly();
    }
}
