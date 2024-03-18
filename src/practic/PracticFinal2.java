package practic;

import java.util.Scanner;

public class PracticFinal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение");
        String s = in.next();
        if (s.charAt(0) =='x'){
            if (s.charAt(1) == '+') {
                System.out.println("Вывод: " + (s.charAt(4) - s.charAt(2)));
            } else if (s.charAt(1) == '-') {
                System.out.println("Вывод: " + (Integer.parseInt(s.substring(4, 5)) + Integer.parseInt(s.substring(2, 3))));
            }
        }
        else if (s.charAt(2) == 'x') {
            if (s.charAt(1) == '+') {
                System.out.println("Вывод " + (s.charAt(4) - s.charAt(0)));
            } else if (s.charAt(1) == '-') {
                System.out.println("Вывод " + (s.charAt(0) - s.charAt(4)));
            }
       }
        else if (s.charAt(4) == 'x') {
            if (s.charAt(1) == '+') {
                System.out.println("Вывод: " + (Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(2, 3))));
            } else if (s.charAt(1) == '-') {
                System.out.println("Вывод: " + (s.charAt(0) - s.charAt(2)));
            }
        }
        else{
            System.out.println("Задайте уравнение в виде: 1+x=2");
        }
    }
}
