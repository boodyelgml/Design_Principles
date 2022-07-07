package DesignPrinciples.InversionOfControl__LooseCouplingVsTighlyCoupling;

public class Sms implements INotificationModel {
    @Override
    public void Notify() {
        System.out.println("Sms");
    }
}
