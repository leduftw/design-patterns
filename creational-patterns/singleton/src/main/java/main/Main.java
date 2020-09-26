package main;

import singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        // Singleton singleton = new Singleton();  // error, Singleton() has private access

        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        System.out.println(first);
        System.out.println(second);

        first.setNumber(5);
        System.out.println();

        System.out.println(first);
        System.out.println(second);
    }

}
