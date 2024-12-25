package daily.recursition.easy;

/**
 * Problem statement:
 * https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
 *
 * Given an array of integers arr, the task is to find the minimum and maximum element of that array using recursion.
 *
 * Input: arr = {1, 4, 3, -5, -4, 8, 6};
 * Output: min = -5, max = 8
 */
public class MaxMinArray {

    private static int minElement(int[] arr,int i,int min){
        if(i==arr.length){
            return min;
        }

        if(arr[i]<min){
            return minElement(arr,i+1,arr[i]);
        }
        return minElement(arr,i+1,min);
    }

    //approach 2

    private static int minElement2(int []arr,int n){
        if(n==1){
            return arr[0];
        }

        return Math.min(arr[n-1],minElement2(arr,n-1));
    }


    private static int maxElement(int[] arr,int i,int max){

        if(i==arr.length){
            return max;
        }

        if(arr[i]>max){
            return maxElement(arr,i+1,arr[i]);
        }
        return maxElement(arr,i+1,max);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6,-20};

        int min=minElement(arr,0,Integer.MAX_VALUE);
        System.out.println(min);

        System.out.println("approach 2: "+minElement2(arr,arr.length));

        int max=maxElement(arr,0,Integer.MIN_VALUE);
        System.out.println(max);
    }
}
