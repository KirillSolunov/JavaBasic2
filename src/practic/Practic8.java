package practic;

import java.util.Scanner;

public class Practic8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное целое n");
        int n = in.nextInt();
        int sum = 0;
        for (int i=0; i<=n; i++){
            if (i % 2 == 1){
                sum += i;
            }
        }
        System.out.println("Сумма нечетных чисел от 1 до " + n + " = " + sum);
    }
}
