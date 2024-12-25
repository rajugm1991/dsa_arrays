package sort;

import java.util.ArrayList;
import java.util.List;

public class DissapperedNumber {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int i=0;

        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
            List<Integer> res=new ArrayList<>();
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1){
                res.add(k+1);
            }
        }

        return res;
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
         int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
