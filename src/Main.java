public class Main {
    public static void main(String[] args) {
        double balance = 573;
        double balanceReplenishment = 1650;
        double bonus = balanceReplenishment / 100;
        if (balanceReplenishment < 1000) {
            bonus = 0;
        }
        double finalBalance = balance + balanceReplenishment + bonus;
        System.out.println("Количество бонусов: " + bonus + " руб ");
        System.out.println("Итоговый счёт: " + finalBalance + "руб");
    }

}