package DesignPrinciples.OpenClosedPrinciple;

public class PremiumCoffeeMachine implements ICofeeMachine{
    public static final String modelName = "Samsung";

    @Override
    public String Filtering() {
        return null;
    }

    @Override
    public String Prepairing() {
        return null;
    }

    @Override
    public String Filling() {
        return null;
    }
}
