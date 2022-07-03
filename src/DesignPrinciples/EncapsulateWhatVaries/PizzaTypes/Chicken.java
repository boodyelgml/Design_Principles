package DesignPrinciples.EncapsulateWhatVaries.PizzaTypes;

import DesignPrinciples.EncapsulateWhatVaries.Data.PizzaTypes;

public class Chicken extends Pizza{
    public static String title = PizzaTypes.CHICKEN;
    public static Integer price = 100;

    @Override
    public String toString() {
        return "Pizza type : " + title + " || total price = " + price.toString();
    }
}
