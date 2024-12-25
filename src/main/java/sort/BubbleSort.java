package sort;

import java.util.Arrays;

public class BubbleSort {


    public static int[] bubbleSort(int[] arr){

        //if array is sorted then idealy first of element in adjacent series will not be swapped.

        boolean isSwapped=false;


        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }
        }

        return arr;

    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
