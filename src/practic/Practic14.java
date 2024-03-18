package practic;

import java.util.Arrays;
import java.util.Random;

public class Practic14 {
    public static void main(String[] args) {
        int[] intArray = new int[15];
        Random random = new Random();
        for (int i=0; i<intArray.length; i++){
            intArray[i]=random.nextInt(41)-20;
        }
        int mini = intArray[0];
        int maxi = intArray[0];
        for (int i:intArray){
            if (i<mini){
                mini = i;
            }
            if (i>maxi){
                maxi=i;
            }
        }
        System.out.println("Min: " + mini + "\n" + "Max: " + maxi);
        System.out.println("Наибольшее по модулю: " + Math.max(Math.abs(mini),Math.abs(maxi)));
        System.out.println(Arrays.toString(intArray));
    }
}
