public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int a = 10; a > 0; a--) {
            System.out.println(a);
        }

        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println(b);
        }

        for (int c = 10; c >= -10; c--) {
            System.out.println(c);
        }

        for (int d = 1904; d <= 2096; d = d + 4){
            System.out.println(d + " год является високосным");
        }

        for (int e = 7; e <= 98; e = e + 7){
            System.out.println(e);
        }

        for (int f = 1; f <= 512; f = f * 2){
            System.out.println(f);
        }


        int factor = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(factor + "*" + i + "=" + (factor * i));
        }

        // Начало дз №7

        double totalMoney = 0;
        double rate = 0.12;
        int month = 0;
        while (totalMoney <= 2459000){
            double interest = totalMoney * rate/12;
            totalMoney = totalMoney + 15000 + interest;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + totalMoney + " рублей");
        }

        byte a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (; a > 0; a--) {
            System.out.print(a + " ");
        }

        int people = 12000000;
        int diffPeople = people/1000;
        int rait = 17;
        int dead = 8;
        for (int year = 1; year <= 10; year++) {
            people = people + (diffPeople * (rait - dead));
            System.out.println("Год " + year + ", численность начеления составляет " + people);
        }

        int savings = 15000;
        int target = 9 * 12;
        double interestRate = 0.07;
        int months = 0;
        while (months <= target) {
            months++;
            double monthlyInterest = savings * interestRate;
            savings += monthlyInterest;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + savings + " рублей");
            }
        }

        int Friday = 5;
        int dayWeek = Friday;
        for (int dayMonth = Friday; dayMonth <= 31; dayMonth += 7) {
            System.out.println("Сегодня пятница, " + dayMonth + "-е число. Необходимо подготовить отчет");
            dayWeek += 7;
        }


        int cometLaunch = 0;
        int startWeak = 1824;
        int lastWeak = 2124;
        for (; cometLaunch <= lastWeak; cometLaunch += 79) {
            if (cometLaunch >= startWeak) {
                System.out.println(cometLaunch);
            }
        }

    }
}