package recurstion;

import java.util.Arrays;

public class MergeRecSort {

    static int[] sort(int[] arr){

        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;

        int[] first=sort(Arrays.copyOfRange(arr,0,mid));
        int[] secod=sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first,secod);
    }

    private static int[] merge(int[] first, int[] secod) {
        int[] mix=new int[first.length+secod.length];
        int i = 0,j = 0,k=0;

        while (i<first.length&&j<secod.length){
            if(first[i]<secod[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=secod[j];
                j++;
            }
            k++;
        }

        while (i<first.length){
            mix[k++]=first[i++];
        }
        while (j<secod.length){
            mix[k++]=secod[j++];
        }
        return mix;
    }


    public static void main(String[] args) {

        int[] arr={5,3,2,1,4,6};

        System.out.println(Arrays.toString(sort(arr)));
    }
}
