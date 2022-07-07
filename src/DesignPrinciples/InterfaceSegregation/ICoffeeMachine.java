package DesignPrinciples.InterfaceSegregation;

public interface ICoffeeMachine {
    String Filtering() throws InterruptedException;

    String Prepairing();

    String Filling() throws InterruptedException;
}
