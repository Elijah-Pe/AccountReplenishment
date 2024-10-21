public class Main {
    public static void main(String[] args) {
        int onAccount = 50;
        int replenishment = 999;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
            onAccount = onAccount + replenishment + bonus;
        } else {
            bonus = 0;
            onAccount = onAccount + replenishment + bonus;
        }
        System.out.println("Пополнение счета. Количество денег на счету: " +
                onAccount);
        System.out.println("Начисленные бонусы: " + bonus);
    }
}