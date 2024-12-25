package recurstion;

import java.util.Arrays;

public class BubbSort {


    static void swap(int[] arr,int index,int index2){
        int temp=arr[index];
        arr[index]=arr[index2];
        arr[index2]=temp;
    }

    static int[] sort(int[] arr,int row,int col){
        if(row==0){
            return arr;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                swap(arr,col,col+1);
            }
            return sort(arr,row,col+1);
        }else{
            return sort(arr,row-1,0);
        }

    }

    public static void main(String[] args) {
        int[] arr={4};
        System.out.println(Arrays.toString(sort(arr,arr.length-1,0)));
    }
}
