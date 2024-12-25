public class FindPeakElement {

    public static int findPeakElement(int[] nums) {

        int start=0;
        int end=nums.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] ar={1,2,3,5,6,2,1};
        System.out.println(findPeakElement(ar));

    }
}
