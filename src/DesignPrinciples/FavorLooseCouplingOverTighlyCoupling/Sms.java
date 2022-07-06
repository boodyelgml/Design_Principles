package DesignPrinciples.FavorLooseCouplingOverTighlyCoupling;

public class Sms implements INotificationModel {
    @Override
    public void Notify() {
        System.out.println("Sms");
    }
}
