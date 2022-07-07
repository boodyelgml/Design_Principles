package DesignPrinciples.InversionOfControl__LooseCouplingVsTighlyCoupling;

public class Mail implements INotificationModel {
    @Override
    public void Notify() {
        System.out.println("Mail");
    }
}
