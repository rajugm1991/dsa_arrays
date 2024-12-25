package arrays;

import java.util.Arrays;

public class MergeSortArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

       int j=n-1;
       int i=m-1;
       int k=nums1.length-1;

       while (j>=0  && i>=0){
           if(i>0 && nums2[j]>=nums1[i] ){
               nums1[k]=nums2[j];
               k--;
               j--;
           }else{
               nums1[k]=nums1[i];
               k--;
               i--;
           }
       }
    }

    public static void main(String[] args) {
        int []nums1 = {0};
    int m = 0;
    int nums2[] = {0};
    int n = 1;
     merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
