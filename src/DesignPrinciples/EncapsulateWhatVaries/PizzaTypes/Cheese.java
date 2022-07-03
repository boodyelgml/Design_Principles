package DesignPrinciples.EncapsulateWhatVaries.PizzaTypes;

import DesignPrinciples.EncapsulateWhatVaries.Data.PizzaTypes;

public class Cheese extends Pizza{
    public static String title = PizzaTypes.CHEESE;
    public static Integer price = 10;

    @Override
    public String toString() {
        return "Pizza type : " + title + " || total price = " + price.toString();
    }
}
