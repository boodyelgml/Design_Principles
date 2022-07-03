package DesignPrinciples.EncapsulateWhatVaries.PizzaTypes;

import DesignPrinciples.EncapsulateWhatVaries.Handler.PizzaHandler;

public class Pizza {

    public static String title;
    public static Integer price;

    // here we encapsulated the pizza object init logic as it will vary over time
    // this can be solved too with Factory Pattern
    public void OrderOnBoard(String type) throws InterruptedException {
        Pizza pizza = PizzaHandler.PreparePizzaOfType(type);

        Prepare();
        cook();
        box();
        System.out.println(pizza);
    }

    // here we encapsulated the pizza object init logic as it will vary over time
    // this can be solved too with Factory Pattern
    public void OrderForDelivery(String type) throws InterruptedException {
        Pizza pizza = PizzaHandler.PreparePizzaOfType(type);

        Prepare();
        cook();
        box();
        System.out.println(pizza);
        System.out.println("=====================");

    }

    public void Prepare() throws InterruptedException {
        System.out.println("Preparing...");
        Thread.sleep(1000);
        System.out.println("Done.");
    }

    public void cook() throws InterruptedException {
        System.out.println("Cooking...");
        Thread.sleep(1500);
        System.out.println("Done.");
    }

    public void box() throws InterruptedException {
        System.out.println("Boxing...");
        Thread.sleep(500);
        System.out.println("Boxed.");
    }

}
