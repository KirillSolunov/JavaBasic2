package practic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticFinal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int lines = in.nextInt();
        List<String> arrays = new ArrayList<>(lines);
        int count = 0;
        int count2 = 1;
        int x = 0;
        String txt = "";
        String longest = "";
        while (count < lines) {
            System.out.println("Введите строку: ");
            txt = in.next();
            arrays.add(txt);
            count++;
        }
        System.out.println("Количество строк: " + lines);

        for (String s: arrays) {
            System.out.println("Строка " + count2++ + ": " + s);
        }
        for (int i = 0; i < arrays.size()-1; i++) {
            if (arrays.get(i).length() > x) {
                x = arrays.get(i).length();
                longest = arrays.get(i);
            }
        }
        System.out.println("Ответ: " + longest);
    }
}
