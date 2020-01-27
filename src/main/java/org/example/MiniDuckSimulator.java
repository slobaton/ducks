package org.example;

/**
 * Hello world!
 *
 */
public class MiniDuckSimulator {
    public static void main( String[] args ) {
        System.out.println("**** MALLARD DUCK ****");
        Duck mallard = new MallardDuck();
        mallard.swim();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        /**System.out.println("**** REDHEAD DUCK ****");
        Duck redhead = new RedheadDuck();
        redhead.swim();
        redhead.display();
        redhead.performFly();
        redhead.performQuack();

        System.out.println("**** RUBBER DUCK ****");
        Duck rubber = new RubberDuck();
        rubber.swim();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        System.out.println("**** Wooden Decoy Duck ****");
        Duck decoy = new DecoyDuck();
        decoy.swim();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();*/
    }
}
