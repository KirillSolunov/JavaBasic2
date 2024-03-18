package practic;
import java.util.Scanner;
public class Practic4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x = in.nextInt();
        System.out.println("Введите второе число:");
        int y = in.nextInt();
        System.out.println("Введите третье число:");
        int z = in.nextInt();
        double aver = (x + + y + z) / 3.0 ;
        System.out.println(aver);
        double averSplitTwo =  aver / 2;
        System.out.println(averSplitTwo);
        averSplitTwo -= averSplitTwo%1;
        System.out.println(averSplitTwo);
        if (averSplitTwo > 3) {
            System.out.println("Программа выполнена корректно");
        }
        else System.out.println("Программа выполнена некорректно");

    }
}
