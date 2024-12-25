package daily.recursition.easy;

public class BinarySearch {

    public  static int search(int[] nums, int target) {

        return rec(nums,0,nums.length,target);
    }

    public static int rec(int[] nums,int s,int e,int target){

        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;

        if(nums[mid]==target){
            return mid;
        }
        else if(target<nums[mid]){
            return rec(nums,s,mid-1,target);
        }
        return rec(nums,s+1,mid,target);
    }

    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        System.out.println(search(arr,9));

    }
}
