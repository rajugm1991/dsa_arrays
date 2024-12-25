public class MissingNumber {


    public  static int missingNumber(int[] nums) {

        //0,1,2

        int length=nums.length;

        int count=0;
        int count2=0;

        int max=0;
        for(int i=0;i<length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            count2+=nums[i];
        }

        for(int i=1;i<max;i++){
            count+=i;
        }
        return count-count2;

    }
    public static void main(String[] args) {


        System.out.println(1234/10);

        int []ar={3,0,1};

        missingNumber(ar);
    }
}
