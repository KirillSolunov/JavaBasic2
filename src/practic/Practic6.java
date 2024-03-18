package practic;

import java.util.Scanner;

public class Practic6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choose1 = in.nextInt();
        if (choose1==1){
            System.out.println("Выберите единицу измерения: 1 - кг, 2 - тонна, 3 - карат, 4 - фунт");
            int choose2 = in.nextInt();
            int choose3;
            switch (choose2){
                case 1:
                    System.out.println("Введите число");
                    choose3 = in.nextInt();
                    System.out.printf("Килограмм - %d \nТонна - %f \nКарат - %d \nФунт - %f ", choose3, choose3/1000.0, choose3*5000, choose3*2.2046226);
                    break;
                case 2:
                    System.out.println("Введите число");
                    choose3 = in.nextInt();
                    System.out.printf("Килограмм - %d \nТонна - %d \nКарат - %d \nФунт - %f ", choose3*1000, choose3, choose3*5000000, choose3*2204.6226);
                    break;
                case 3:
                    System.out.println("Введите число");
                    choose3 = in.nextInt();
                    System.out.printf("Килограмм - %f \nТонна - %f \nКарат - %d \nФунт - %f ", choose3*0.0002, choose3*0.0000002, choose3, choose3*0.00044092452);
                    break;
                case 4:
                    System.out.println("Введите число");
                    choose3 = in.nextInt();
                    System.out.printf("Килограмм - %f \nТонна - %f \nКарат - %f \nФунт - %d ", choose3*0.4535923744953, choose3*0.0004535923744953, choose3*2267.9618724765, choose3);
                    break;
                default:
                    System.out.println("Извините, единицы измерения выбраны не из списка");
                    break;
            }
        }
        else if (choose1==2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int choose2 = in.nextInt();
            int choose3;
            switch (choose2){
                case 1:
                    System.out.println("Введите число");
                    choose3 = in.nextInt();
                    System.out.printf("Метр - %d \nМиля - %f \nЯрд - %f \nФут - %f ", choose3, choose3*0.00062137119223733, choose3*1.0936132983377, choose3*3.2808398950131);
                    break;
                case 2:
                    System.out.println("Введите число");
                    choose3 = in.nextInt();
                    System.out.printf("Метр - %f \nМиля - %d \nЯрд - %d \nФут - %d ", choose3*1609.344, choose3, choose3*1760, choose3*5280);
                    break;
                case 3:
                    System.out.println("Введите число");
                    choose3 = in.nextInt();
                    System.out.printf("Метр - %f \nМиля - %f \nЯрд - %d \nФут - %d ", choose3*0.9144, choose3*0.00056818181818182, choose3, choose3*3);
                    break;
                case 4:
                    System.out.println("Введите число");
                    choose3 = in.nextInt();
                    System.out.printf("Метр - %f \nМиля - %f \nЯрд - %f \nФут - %d ", choose3*0.3048, choose3*0.00018939393939394, choose3*0.33333333333333, choose3);
                    break;
                default:
                    System.out.println("Извините, единицы измерения выбраны не из списка");
                    break;
            }

        }
        else {
            System.out.println("Конвертер пока содержит только 2 физических величины");
        }

    }
}
