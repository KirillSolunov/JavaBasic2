package practic;


import java.util.Scanner;

public class PracticFinal3NextTry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int lines = in.nextInt();
        in.nextLine();
        String[] arr1 = new String[lines];
        String[] arr2 = new String[lines];
        for (int i=0;i<lines;i++){
            System.out.println("Введите " + (i+1) + " строку:");
            arr1[i]=in.nextLine();
            // Необходимо чтобы избежать NullPointerException в 23 строке
            arr2[i]=" ";
        }
       // System.out.println(arr1[0].length());
        for(int i=0;i<lines;i++){
            for (int j=0;j<arr1[i].length();j++){
                if (!((arr2[i].indexOf(arr1[i].charAt(j)))>-1)){
                    arr2[i]= arr2[i] + arr1[i].charAt(j) ;
                }
            }
        }
        int maxLeng= arr2[0].length();
        int indexMaxLen = 0;
        for (int i=0;i<lines;i++){
            if (arr2[i].length()>maxLeng){
                maxLeng=arr2[i].length();
                indexMaxLen = i;
            }
        }
        System.out.println("Первая строка с максимальным количеством различных символов: " + arr1[indexMaxLen]);
    }
}
