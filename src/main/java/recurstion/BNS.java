package recurstion;

public class BNS {


    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(--n);
    }

    static void print2(int n){
        if(n==0){
            return;
        }
        print(--n);
        System.out.println(n);

    }

    public static int search(int[] arr,int target,int s,int e){

        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        else if(target<arr[m]){
            return search(arr,target,s,m-1);
        }else{
            return search(arr,target,m+1,e);
        }
    }

    public static void main(String[] args) {
        print2(5);
        int[] arr={1,2,3,4,5,67,77,333};

        System.out.println(search(arr,333,0,arr.length-1));
    }
}
