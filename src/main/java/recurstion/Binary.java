package recurstion;

public class Binary {

    public static void main(String[] args) {
        int [] arr={1,2,4,5,6,22,34,55,66};
        System.out.println(search(arr,66,0,arr.length-1));
    }

    public static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr,target,s,mid-1);
        }
        return search(arr,target,mid+1,e);
    }
}
