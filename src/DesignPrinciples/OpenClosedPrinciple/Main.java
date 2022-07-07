package DesignPrinciples.OpenClosedPrinciple;

// لازم يكون الكلاس او البيزنس او الموديول مفتوح للتمدد ومغلق للتعديل
// وبنستخدم ال interface عشان نحقق المبدأ دا

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // get basic coffee
        CoffeeServiceProvider coffeeServiceProvider = new CoffeeServiceProvider(new BasicCoffeeMachine());
        String result = coffeeServiceProvider.BuyCofee();
        System.out.println(result);

         // get premium coffee
        CoffeeServiceProvider coffeeServiceProvider2 = new CoffeeServiceProvider(new PremiumCoffeeMachine());
        String result2 = coffeeServiceProvider2.BuyCofee();
        System.out.println(result2);

    }
}
