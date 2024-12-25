public class BinarySearchCeiling {



    static int cieilingSearch(int arr[], int target){

        if(target>arr[arr.length-2]){
            return -1;
        }

        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start/2);
            if(arr[mid]==target){
                return arr[mid];
            }
            if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return arr[start];
    }

    static int floorSearch(int arr[], int target){

        if(target<arr[0]){
            return -1;
        }

        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start/2);
            if(arr[mid]==target){
                return arr[mid];
            }
            if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return arr[end];
    }


    public static void main(String[] args) {

        int arr[]={2,4,6,8,10,14,26,44,66};

        System.out.println(cieilingSearch(arr,30));
        System.out.println(floorSearch(arr,11));


    }
}


