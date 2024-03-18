package practic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practic3 {
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4};
        System.out.println(Arrays.toString(nums));
        int  temp = nums[0];
        int len= nums.length;
        nums[0] = nums[len - 1];
        nums[len - 1] = temp;
        int s;
        s = nums[0] + nums[len/2];
        System.out.println(Arrays.toString(nums));
        System.out.println(s);


    }
}
