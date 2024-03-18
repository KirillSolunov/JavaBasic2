package practic;

import java.util.Scanner;

public class PracticFinal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Введите ответ:");
        int attemptCounter = 1;
        String ans = in.nextLine();
        while (attemptCounter < 3) {
            if (!ans.equalsIgnoreCase("Заархивированный вирус") && !ans.equalsIgnoreCase("Подсказка")) {
                attemptCounter += 1;
                System.out.println("Подумай еще!");
                System.out.println("Введите ответ:");
                ans = in.nextLine();
                if (attemptCounter == 3 && !ans.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                } else if (ans.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                    break;
                }
            } else if (ans.equalsIgnoreCase("Подсказка")) {
                if (attemptCounter == 1) {
                    System.out.println("сурив йыннаворивихрааЗ");
                    attemptCounter = 2;
                } else if (attemptCounter != 1) {
                    System.out.println("Подсказка уже недоступна");
                }
                attemptCounter += 1;
                System.out.println("Введите ответ:");
                ans = in.nextLine();
                if (attemptCounter == 3 && !ans.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                } else if (ans.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                    break;
                }
            }

            else if (ans.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            }
        }
    }
}
