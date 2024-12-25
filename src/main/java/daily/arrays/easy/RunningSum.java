package daily.arrays.easy;

import java.util.Arrays;

public class RunningSum {

    //approach-1
    public static void runningSum(int[] arr){

        int sum=0;
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            res[i]=sum;
        }
        System.out.println(Arrays.toString(res));
    }

    //recursion

    public static void runningSum2(int[] arr,int index,int sum){
        if(index==arr.length){
            return;
        }
        sum+=arr[index];
        runningSum2(arr,index+1,sum);
        arr[index]=sum;
    }



    public static void main(String[] args) {

        int [] ar={1,2,3,4};
        runningSum2(ar,0,0);
        System.out.println(Arrays.toString(ar));
    }
}
