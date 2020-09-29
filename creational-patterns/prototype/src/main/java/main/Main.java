package main;

import prototype.ConcretePrototype;
import prototype.Prototype;

public class Main {

    public static void main(String[] args) {
        try {
            Prototype prototype = new ConcretePrototype();
            Prototype clonedPrototype = prototype.clone();

            System.out.println("Before modification:\n");
            printPrototypes(prototype, clonedPrototype);
            System.out.println();

            // Change arrayField in original and cloned object
            prototype.getArrayField()[0] = 11;
            clonedPrototype.getArrayField()[0] = 10;

            System.out.println("After modification:\n");
            printPrototypes(prototype, clonedPrototype);
            System.out.println();

        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException thrown!");
        }
    }

    private static void printPrototypes(Prototype original, Prototype clone) {
        System.out.println("Original prototype:");
        System.out.println(original);
        System.out.println();

        System.out.println("Cloned prototype:");
        System.out.println(clone);
        System.out.println();
    }

}
