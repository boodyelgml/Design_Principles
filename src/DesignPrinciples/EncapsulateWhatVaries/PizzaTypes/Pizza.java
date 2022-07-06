package DesignPrinciples.EncapsulateWhatVaries.PizzaTypes;

import DesignPrinciples.EncapsulateWhatVaries.Handler.PizzaHandler;

import java.util.Scanner;

public class Pizza {

    public static String title = "Pizza";
    public static Integer price = 0;

    // here we encapsulated the pizza object init logic as it will vary over time
    // this can be solved too with Factory Pattern
    public void OrderOnBoard(int pizzaNumber) throws InterruptedException {
        Pizza pizza = PizzaHandler.PreparePizzaOfType(pizzaNumber);

        Prepare();
        cook();
        box();
        System.out.println("=====================");
        System.out.println(pizza);

    }

    // here we encapsulated the pizza object init logic as it will vary over time
    // this can be solved too with Factory Pattern
    public void OrderForDelivery(int type) throws InterruptedException {
        Pizza pizza = PizzaHandler.PreparePizzaOfType(type);

        Prepare();
        cook();
        box();
        System.out.println(pizza);
        System.out.println("=====================");

    }

    public void Prepare() throws InterruptedException {
        System.out.print("Preparing...");
        Thread.sleep(1000);
        System.out.println("Done.");
    }

    public void cook() throws InterruptedException {
        System.out.print("Cooking...");
        Thread.sleep(1500);
        System.out.println("Done.");
    }

    public void box() throws InterruptedException {
        System.out.print("Boxing...");
        Thread.sleep(500);
        System.out.println("Boxed.");
    }

}
