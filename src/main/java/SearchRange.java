import java.util.Arrays;

public class SearchRange {

    public int[] searchRange2(int[] nums, int target) {
        int []ans={-1,-1};
        int first=search(nums,target,true);
        int last=search(nums,target,false);
        return new int[]{first,last};
    }

    public int search(int[] nums,int target,boolean isFirstOccurance){
        int res=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+end-start/2;
            if(target>nums[mid]){
                start=mid+1;
            }else if(target<nums[mid]){
                end=end-1;
            }else{
                res=mid;
                if(isFirstOccurance){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return res;
    }
    public static int[] searchRange(int[] nums, int target) {

        if(nums.length==1){
            if(target==nums[0]){
                return new int[]{0,0};
            }
        }
        int start=0;
        int end=nums.length-1;

        int[] res ={-1,-1};
        int count=0;
        while (start<=end){
            int mid=start+end-start/2;
            if(target==nums[mid]){
                if(count<=2) {
                    res[count] = mid;
                    count++;
                }
            }
            if(target>nums[mid]){
                start=mid+1;
            }else {
                end = mid - 1;
            }
        }
        if(res[0]>res[1]&&count>1){
            return new int[]{res[1],res[0]};
        }
        if(res[0]!=res[1]){
            return new int[]{res[count-1],res[count-1]};
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums={1,3};

        System.out.println(Arrays.toString(searchRange(nums,1)));

    }
}
