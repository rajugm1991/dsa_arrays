package sort;

import java.util.Arrays;

/**
 * If num is range from 1,n -> with time complexity o(n)
 */
public class CyclicSort {


    public static int[] cycleSort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[correctIndex]!=arr[i]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int correctIndex) {

        int temp=arr[i];
        arr[i]=arr[correctIndex];
        arr[correctIndex]=temp;
    }


    public static void main(String[] args) {

        int[] arr={4,1,2,3,5};

        System.out.println(Arrays.toString(cycleSort(arr)));
    }
}
