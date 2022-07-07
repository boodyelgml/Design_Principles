package DesignPrinciples.InversionOfControl__LooseCouplingVsTighlyCoupling;

public class NotificationService {
    public final INotificationModel notificationModel;

    public NotificationService(INotificationModel iNotificationModel) {
        this.notificationModel = iNotificationModel;
    }

    public void Send(){
        this.notificationModel.Notify();
    }
}
