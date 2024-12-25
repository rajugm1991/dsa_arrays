import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {

        // 2,5,1,3,4,7
        int []va=new int[nums.length];
        int temp=0;
        for(int i=0; i<nums.length;i++){
            if(i%2==0){
                    va[i]=nums[temp++];
            }else{
                va[i]=nums[n];
                n=n+1;
            }
        }
        return va;

    }

    public static int findKthPositive(int[] arr, int k) {
        for(int i = 0;i < arr.length;i++){
            if(arr[i] <= k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
    public static void main(String[] args) {

    int []aar={5,8,9,12};
        System.out.println(findKthPositive(aar,70));

        System.out.println("--"+(3/2*((3+1))));
        System.out.println("--"+(3*(3+1)/2));
         int []a={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(a,3)));

    }
}
