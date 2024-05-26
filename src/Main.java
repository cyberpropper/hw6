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
            System.out.println("Високосный год " + d);
        }

        for (int e = 7; e <= 98; e = e + 7){
            System.out.println(e);
        }

        for (int f = 1; f <= 512; f = f * 2){
            System.out.println(f);
        }


        int money = 0;
        int totalMoney = 0;
        for (int g = 1; g <= 12; g++){
            money = money + (29000);
            totalMoney = money + (money/100);
            System.out.println("Месяц " + g + " сумма накоплений равна " + totalMoney + " рублей");
        }


        int factor = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(factor + "*" + i + "=" + (factor * i));
        }




    }
}