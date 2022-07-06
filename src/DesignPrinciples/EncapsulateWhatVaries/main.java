package DesignPrinciples.EncapsulateWhatVaries;

import DesignPrinciples.EncapsulateWhatVaries.Data.PizzaTypes;
import DesignPrinciples.EncapsulateWhatVaries.PizzaTypes.Pizza;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("1- cheese");
        System.out.println("2- Margherita");
        System.out.println("3- Buffalo");
        System.out.println("4- chicken");

        System.out.println("type your order number ... ");

        Scanner scanner = new Scanner(System.in);
        int PizzaNumber = scanner.nextInt();

        Pizza pizza = new Pizza();
        pizza.OrderOnBoard(PizzaNumber);
        //pizza.OrderForDelivery(PizzaNumber);
    }
}





