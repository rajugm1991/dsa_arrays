package ashish.arrays;

import java.util.Arrays;

public class MoveZeros {

    //approac1 bruit force

    static void moveZeros(int[] nums){

        int lastIndex=nums.length-1;

        int k=0;
        for(int i = 0; i<lastIndex; i=i+1-k){
            if(nums[i]==0){
                for (int j=i;j<lastIndex;j++){
                    nums[j]=nums[j+1];
                }
                nums[lastIndex] = 0;
                lastIndex--;

            }
        }

    }



    static  void moveZeros2(int [] nums){

        int insertNonZeroindex=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertNonZeroindex]=nums[i];
                insertNonZeroindex++;
            }
        }
        while (insertNonZeroindex< nums.length){
            nums[insertNonZeroindex]=0;
            insertNonZeroindex++;
        }
    }

    public static void main(String[] args) {

        int[] nums={0,0,0,1,2,0,3};
        moveZeros2(nums);
        System.out.println(Arrays.toString(nums));
    }
}
