package recurstion;

import java.util.Arrays;

public class QuickSort {


    static void sort(int[] arr,int s,int e){

        if(s>=e){
            return;
        }
        int low=s;
        int high=e;
        int mid=s+(e-s)/2;
        int pivt=arr[mid];
        while (s<=e){
            while (arr[s]<pivt){
                s++;
            }
            while (arr[e]>pivt){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }

    static void sort2(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, hi);
    }

    public static void main(String[] args) {
        int [] arr={4,2,6,1,12,15,19,16,11};
        sort2(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
