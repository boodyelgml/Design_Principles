package DesignPrinciples.EncapsulateWhatVaries;

import DesignPrinciples.EncapsulateWhatVaries.PizzaTypes.Pizza;

import java.util.Scanner;

// Encapsulate what varies //
// Considered as the foundational design principles, this principle is found at work in almost all design patterns. This principle suggests, Identify the aspects of
// your applications that vary and separate them from what stays the same.

//لو عندك كود دائم التغير وسط أكواد ثابتة ف من الضرورى انك تعزلة encapsulate ف كلاس لوحدة
// عشان لو حبيت تستخدمة ف اكتر من مكان يبقى التعديل ف مكان واحد بس

public class Main {
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





