package sort;

import java.util.Arrays;

public class SelectionSort {


    public static int[] selectionSort(int[] arr){

        // Loop array values and Get the max index and swap to right position.

        for(int i=0;i<arr.length;i++){
            int end=arr.length-1-i;
            int maxIndex=getMaxIndex(arr,0,end);
            swapIndex(arr,maxIndex,end);
        }
        return arr;
    }

    private static void swapIndex(int[] arr, int maxIndex, int end) {
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[end];
        arr[end]=temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {

        int max=start;

        for(int i=0;i<=end;i++){

            if(arr[i]>arr[max]){
                max=i;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr={4,1,3,2,6,2,7};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
