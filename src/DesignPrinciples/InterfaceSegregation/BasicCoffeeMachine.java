package DesignPrinciples.InterfaceSegregation;

public class BasicCoffeeMachine implements IBasicCoffeeMachine , ICoffeeServiceProvider{

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

    @Override
    public String BasicBoxing() throws InterruptedException {
        return "Basic Boxing .. Finished!";
    }


    @Override
    public String BuyCoffee() throws InterruptedException {
        this.Prepairing();
        this.Filtering();
        this.Filling();
        return this.BasicBoxing();
    }


}
