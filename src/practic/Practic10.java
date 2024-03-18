package practic;

import java.util.Arrays;
import java.util.Scanner;

public class Practic10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк в матрице");
        int strok = in.nextInt();
        System.out.println("Введите количество столбцов в матрице");
        int stolb = in.nextInt();
        int[][] myArray = new int[strok][stolb];
        for (int i=0; i<strok; i++){
            for(int j=0; j<stolb; j++){
                myArray[i][j]=in.nextInt();
            }
        }
        for(int j=0; j<stolb; j++){
            System.out.print(myArray[0][j]*3 + " ");
        }
        System.out.println(Arrays.deepToString(myArray));


    }
}
