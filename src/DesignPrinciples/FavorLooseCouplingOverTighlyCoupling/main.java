package DesignPrinciples.FavorLooseCouplingOverTighlyCoupling;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Mail mail = new Mail();
        NotificationService notificationService = new NotificationService(mail);
        notificationService.notify();
    }
}
// زى البلاى ستيشن بالظبط لو الدراع ملوش سوكيت ف البلاى ستيشن وباظ هنغيرة بصعوبة جدا
// عشان نركبلة سوكيت بنعمل مكان ف البلاى ستيشن بنفس مواصفات السوكيت اللى هيركب
// بالتالى أقدر اركب اى دارع واغيرة بنفسى بدون ما نغير حاجه ف البلاى ستيشن
// ودا بنحققة ف الكود بأستخدام ال interface بيعبر عن مكان السوكيت
// أو بالأصح بنعمل interface على هيئة اى كلاس هيشتغل على السيرفيس