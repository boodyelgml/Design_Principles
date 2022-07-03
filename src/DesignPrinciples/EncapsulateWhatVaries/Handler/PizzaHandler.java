package DesignPrinciples.EncapsulateWhatVaries.Handler;

import DesignPrinciples.EncapsulateWhatVaries.PizzaTypes.Buffalo;
import DesignPrinciples.EncapsulateWhatVaries.PizzaTypes.Cheese;
import DesignPrinciples.EncapsulateWhatVaries.PizzaTypes.Chicken;
import DesignPrinciples.EncapsulateWhatVaries.PizzaTypes.Margherita;
import DesignPrinciples.EncapsulateWhatVaries.PizzaTypes.Pizza;
import DesignPrinciples.EncapsulateWhatVaries.Data.PizzaTypes;

import static DesignPrinciples.EncapsulateWhatVaries.Data.PizzaTypes.CHICKEN;

public class PizzaHandler {
    public static Pizza PreparePizzaOfType(String type){
        Pizza pizza;

        switch (type) {
            case PizzaTypes.CHEESE:
                pizza = new Cheese();
                break;
            case PizzaTypes.MARGHERITA:
                pizza = new Margherita();
                break;
            case PizzaTypes.BUFFALO:
                pizza = new Buffalo();
                break;
            default:
                pizza = new Chicken();
                break;
        }

        return pizza;
    }
}
