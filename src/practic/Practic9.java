package practic;

import java.util.Scanner;

public class Practic9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int len = in.nextInt();
        double[] myArray = new double[len];
        double sum = 0.0;
        double aver;
        for(int i=0;i<len;i++){
            System.out.println("Введите " + (i+1) + " элемент массива:");
            myArray[i]= in.nextDouble();
            sum += myArray[i];
        }
        aver = sum / len;
        System.out.println("Average " + aver);
        System.out.println("Sum "+sum);
        for (int i=0; i<len; i++){
            System.out.print(myArray[i]*aver + " ");
        }

    }
}
