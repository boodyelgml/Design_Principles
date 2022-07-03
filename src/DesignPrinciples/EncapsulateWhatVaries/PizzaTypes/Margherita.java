package DesignPrinciples.EncapsulateWhatVaries.PizzaTypes;

import DesignPrinciples.EncapsulateWhatVaries.Data.PizzaTypes;

public class Margherita extends Pizza{
    public static String title = PizzaTypes.MARGHERITA;
    public static Integer price = 20;

    @Override
    public String toString() {
        return "Pizza type : " + title + " || total price = " + price.toString();
    }
}
