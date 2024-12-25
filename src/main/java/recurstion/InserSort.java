package recurstion;

import java.util.Arrays;

public class InserSort {


    static void print(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            c=c+1;
            print(arr,r,c);
            if(c>0){
                if(arr[c]<arr[c-1]){
                    int temp=arr[c];
                    arr[c]=arr[c-1];
                    arr[c-1]=temp;
                }
            }
        }else{
            print(arr,r-1,0);
            System.out.println("x");
        }

    }

    public static void main(String[] args) {
        int[] arr={6,3,2,1,5,89,12,15};
        print(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}
