package DesignPrinciples.OpenClosedPrinciple;

public interface ICofeeMachine {

    String Filtering() throws InterruptedException;

    String Prepairing();

    String Filling() throws InterruptedException;

}
