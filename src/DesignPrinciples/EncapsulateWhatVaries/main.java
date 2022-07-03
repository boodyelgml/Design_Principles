package DesignPrinciples.EncapsulateWhatVaries;

import DesignPrinciples.EncapsulateWhatVaries.Data.PizzaTypes;
import DesignPrinciples.EncapsulateWhatVaries.PizzaTypes.Pizza;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Pizza pizza = new Pizza();
        pizza.OrderOnBoard(PizzaTypes.BUFFALO);
        pizza.OrderForDelivery(PizzaTypes.CHICKEN);
    }
}





