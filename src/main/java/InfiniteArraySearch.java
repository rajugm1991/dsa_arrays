public class InfiniteArraySearch {

    public static void main(String[] args) {

        int []arr={2,3,4,6,7,11,12,14,15,17,18,20};

        System.out.println(search(arr,55));
    }


    public static int search(int [] arr,int target){
        int start=0;
        int end=1;

        while (target>arr[end]){
            int temp=end+1;
            //end=(start-1)
             end=temp*2+1;
             start=temp;
        }
        return binarySearch(arr,target,start,end);
    }

    public static int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch2(arr, target, start, end);

    }
    static int binarySearch2(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }



}
