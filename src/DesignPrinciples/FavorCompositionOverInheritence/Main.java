package DesignPrinciples.FavorCompositionOverInheritence;

import DesignPrinciples.FavorCompositionOverInheritence.Data.Benfits;
import DesignPrinciples.FavorCompositionOverInheritence.ConsoleHandler.ConsolePrinter;
import DesignPrinciples.FavorCompositionOverInheritence.Handler.BenfitsHandler;

import java.util.Scanner;

// لما نيجى نفكر ف التوارث لازم الأول نسأل العلاقة أية بين الأثنين
// إذا كانت علاقة نقية تماما و بتعبر عن is a ف بنستخدم ال inheritance
// اما اذا كانت العلاقة غير نقية وبتعبر عن has a ف بنستخدم التكوين او ال composition

public class Main {

    public static void main(String[] args) {

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
