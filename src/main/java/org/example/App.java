package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println("**** MALLARD DUCK ****");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.fly();

        System.out.println("**** REDHEAD DUCK ****");
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.display();
        redheadDuck.fly();

        System.out.println("**** RUBBER DUCK ****");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.display();

        System.out.println("**** Wooden Decoy Duck ****");
        DecoyDuck woodenDecoyDuck = new DecoyDuck();
        woodenDecoyDuck.swim();
        woodenDecoyDuck.display();
    }
}
