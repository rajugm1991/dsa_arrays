package sort;

import java.util.Arrays;

public class MissingNumber {


    public static void swap(int[] nums, int i ,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static int missingNumber(int[] nums) {
        //    int n=nums.length;
        //     int tSum = n*(n+1) / 2;
        //     int sum=0;
        //     for(int i=0;i<n;i++){
        //         sum += nums[i];
        //     }
        //     return tSum-sum;

        //cycle sort

        // 4,0,1,2

        int i=0;

        while(i<nums.length){
            int currectPos=nums[i];
            if( currectPos<nums.length-1 && nums[i]!=nums[currectPos]){
                swap(nums,i,currectPos);
            }else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length+1;
    }

    public static void main(String[] args) {
        int [] arr={4,0,1,2};

        System.out.println(missingNumber(arr));
    }
}
