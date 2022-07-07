package DesignPrinciples.InversionOfControl__LooseCouplingVsTighlyCoupling;

// تخيل بلاى ستيشن متوصل علية دراع بدون وجود سوكيت
// تغييرة أو صيانتة هتتطلب فك البلاىستيشن كلة ودا لأنهم مرتبطين ببعض Tightly
// لو ركبنا مكان ف البلاى ستيشن ياخد سوكيت الدراع هيكون كدا العلاقة ما بينهم Loosely
// بنعمل كدا ف الكود بأستخدام ال interface
// وبيكون بالظبط على شكل أى سوكيت دراع وبالتالى مهما اتغير الدراع ف هيركب عادى وهيشتغل
// طبعا بنركب السوكيت interface ف البلاىستيشن

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // mail بمثابة الدراع
        // دا بمثابة البلاستيشن
        NotificationService notificationService = new NotificationService(new Mail());
        notificationService.notify();
    }
}
