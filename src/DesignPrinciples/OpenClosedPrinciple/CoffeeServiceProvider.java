package DesignPrinciples.OpenClosedPrinciple;

// here we use loosly coupling principle
public class CoffeeServiceProvider {
    ICofeeMachine iCofeeMachine;

    public CoffeeServiceProvider(ICofeeMachine iCofeeMachine) {
        this.iCofeeMachine = iCofeeMachine;
    }

    public String BuyCofee() throws InterruptedException {
        this.iCofeeMachine.Prepairing();
        this.iCofeeMachine.Filtering();
        return this.iCofeeMachine.Filling();
    }
}
