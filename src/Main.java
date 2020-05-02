public class Main {
    public static void main(String[] args) {
        int balanceKops = 10000;
        int refillKops = 100000;
        int bonus;

        if (refillKops <= 100000) {
            bonus = 0;
        }

        else {
            bonus = refillKops / 100; //в копейках
        }

        balanceKops += refillKops + bonus;

        System.out.println();
        System.out.println("Баланс после пополнения с учетом бонусов, руб (копейки отбрасываются): " + balanceKops / 100);
        System.out.println("Размер бонуса, руб (копейки отбрасываются): " + bonus / 100);
    }
}