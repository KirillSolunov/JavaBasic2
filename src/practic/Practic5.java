package practic;

import java.util.Scanner;

public class Practic5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();
        System.out.println("Введите число");
        int y = in.nextInt();
        System.out.println("Введите операцию");
        String oper = in.next();
        switch (oper){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "/":
                System.out.println(x/y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            default:
                System.out.println("Такой операции пока не знаем");
                break;

        }
    }
}
