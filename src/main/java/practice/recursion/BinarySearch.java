package practice.recursion;

public class BinarySearch {


    static int search(int [] arr,int s,int e,int target){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target>arr[mid]){
            return search(arr,mid+1,e,target);
        }
        return search(arr,s,mid-1,target);
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,6,8,9,12};

        System.out.println(search(arr,0,arr.length-1,8));
    }
}
