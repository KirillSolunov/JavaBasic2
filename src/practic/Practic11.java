package practic;

import java.util.Scanner;

public class Practic11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое значение");
        String y = String.valueOf(in.nextInt());
        System.out.println("Введите второе значение");
        Integer x = in.nextInt();
        int result;
        result = x.compareTo(Integer.valueOf(y));
        if (result<0){
            System.out.println("Большее число: " + y);
            System.out.println("Меньшее число конвертированное в double: " + Double.valueOf(x));
        }
        else if (result>0) {
            System.out.println("Большее число: " + x);
            System.out.println("Меньшее число конвертированное в double: " + Double.valueOf(y));
        }
        else {
            System.out.println("Значения одинаковые, 1-е значение: "+ x);
            System.out.println("Значения одинаковые, 2-е значение конвертированное в double: " + Double.valueOf(y));
        }
    }
}
