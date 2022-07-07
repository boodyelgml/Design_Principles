package DesignPrinciples.InterfaceSegregation;

// من الآخر متحطش حاجات ف الانترفيس ممكن الكلاس ميكونش محتاجها
// بالتالى لازم تفصل ما بين ال interfaces وكل كلاس يعمل implement حسب احتياجاته
// نفس مفهوم Liskov substitution بس من منظور ال interface

public class Main {
    public static void main(String[] args) throws InterruptedException {

        CoffeeMachine BasicCoffee = new CoffeeMachine(new BasicCoffeeMachine());
        CoffeeMachine PremiumMachine = new CoffeeMachine(new PremiumCoffeeMachine());

        System.out.println(BasicCoffee.BuyCoffee());
        System.out.println(PremiumMachine.BuyCoffee());

    }
}
