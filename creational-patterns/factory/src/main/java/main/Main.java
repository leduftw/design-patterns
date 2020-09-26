package main;

import drivers.DatabaseDriver;
import factory.Factory;

public class Main {

    public static void main(String[] args) {
        DatabaseDriver driver = Factory.getDriver("PostgreSQL");
        System.out.println(driver);  // prints "PostgreSQL driver"
    }

}
