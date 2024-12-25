package leetcodedailypractice;

import java.util.Arrays;

public class ArrayConcat {

    public static int[] getConcatenation(int[] nums) {

        int res[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
            res[i+nums.length]=nums[i];
        }
    return res;
    }

    public static void main(String[] args) {

        int ar[]={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(ar)));
    }
}
