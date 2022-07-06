package DesignPrinciples.OpenClosedPrinciple;

public class BasicCoffeeMachine  implements ICofeeMachine {

    @Override
    public String Prepairing() {
        return "Preparing ... ";
    }

    @Override
    public String Filtering() throws InterruptedException {
        Thread.sleep(500);
        return "Filtering ... ";
    }


    @Override
    public String Filling() throws InterruptedException {
        Thread.sleep(500);
        return "Filling ... ";
    }
}
