package DesignPrinciples.EncapsulateWhatVaries.PizzaTypes;

import DesignPrinciples.EncapsulateWhatVaries.Data.PizzaTypes;

public class Buffalo extends Pizza {
    public static String title = PizzaTypes.BUFFALO;
    public static Integer price = 30;

    @Override
    public String toString() {
        return "Pizza type : " + title + " || total price = " + price.toString();
    }
}
