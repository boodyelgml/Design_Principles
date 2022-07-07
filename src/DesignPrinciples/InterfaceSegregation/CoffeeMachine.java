package DesignPrinciples.InterfaceSegregation;

public class CoffeeMachine {
    ICoffeeServiceProvider coffeeServiceProvider;

    public CoffeeMachine(ICoffeeServiceProvider coffeeServiceProvider) {
        this.coffeeServiceProvider = coffeeServiceProvider;
    }

    public String BuyCoffee() throws InterruptedException {
        return this.coffeeServiceProvider.BuyCoffee();
    }
}
