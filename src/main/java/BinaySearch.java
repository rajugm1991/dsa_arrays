public class BinaySearch {


    /**
     *  {2,3,4,5,6,7,8,9,10}
     *
     *
     * @param arr
     * @param val
     * @return
     */
    static int search(int[] arr,int val){

        int start=0;
        int end=arr.length-1;

        while (start<=end){
            //what if int exceeds end up with problem
            int mid= start+((end-start)/2);
            if(val>arr[mid]){
                start=mid+1;
            }else if(val<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8,9};
        System.out.println(search(ar,9));
    }
}
