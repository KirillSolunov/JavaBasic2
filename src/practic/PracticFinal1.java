package practic;

import java.util.Scanner;

public class PracticFinal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Курс доллара: ");
        double coursOfDollar = in.nextDouble();
        System.out.println("Количество рублей:");
        double rub = in.nextDouble();
        System.out.printf("%s %.2f %s","Итого: ",rub/coursOfDollar, " долларов");
    }
}
