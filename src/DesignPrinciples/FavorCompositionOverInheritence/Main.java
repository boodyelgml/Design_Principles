package DesignPrinciples.FavorCompositionOverInheritence;

import DesignPrinciples.FavorCompositionOverInheritence.Data.Benfits;
import DesignPrinciples.FavorCompositionOverInheritence.ConsoleHandler.ConsolePrinter;
import DesignPrinciples.FavorCompositionOverInheritence.Handler.BenfitsHandler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // we composite an object inside every object instead of inherit from it
        // because Employee "has a" person
        // because Programmer "has an" employee

        Person person = new Person("Abdelrahman Fathy", "27");
        Employee employee = new Employee("Front End", person);
        Programmer programmer = new Programmer("Junior","Front end", employee);

        Integer choice = 0;
        do {
            ConsolePrinter.Print(Benfits.benefitsList);
            // get console input
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            // encapsulate what varies && factory pattern
            String selectedBenefit = BenfitsHandler.getBenfitsOf(choice, Benfits.benefitsList);
            // composition
            if (selectedBenefit.length() > 0)
                programmer.addToBenfits(selectedBenefit);
        } while (choice != 0);
        System.out.println(programmer);

    }
}
