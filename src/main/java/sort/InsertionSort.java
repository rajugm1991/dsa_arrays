package sort;

import java.util.Arrays;

public class InsertionSort {


    public static void swapArray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static int[] insertionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1; j>0;j--){
                if(arr[j]<arr[j-1]){
                    swapArray(arr,j,j-1);
                }else{
                    //break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={4,2,6,1,4,7,8,3,1,3,5,6,3,2,1};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
