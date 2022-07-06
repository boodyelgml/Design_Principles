package DesignPrinciples.FavorLooseCouplingOverTighlyCoupling;

public class Mail implements INotificationModel {
    @Override
    public void Notify() {
        System.out.println("Mail");
    }
}
