import java.util.Arrays;
import java.util.List;

public class FindMountainArray {
    public static int findInMountainArray(int target, MountainArray mountainArr) {

        int peakElement=peakNumber(mountainArr);

        int start=0;
        int end=peakElement;
        int searchVal=binarySearch(mountainArr,target,start,end,true);
        if(searchVal==-1){
            searchVal=binarySearch(mountainArr,target,end+1,mountainArr.length()-1,false);
        }
        return searchVal;

    }

    public static int peakNumber(MountainArray mountainArr){
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

    public static int binarySearch(MountainArray mountainArr,int target,int start, int end,boolean isAsc){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            if(isAsc) {
                if (target > mountainArr.get(mid)) {
                    start = mid + 1;
                } else if (target < mountainArr.get(mid)) {
                    end = mid - 1;
                }
            }else{
                if (target > mountainArr.get(mid)) {
                    end = mid - 1;
                } else if (target < mountainArr.get(mid)) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        MountainArray mountainArray=new MountainArray();
       int ele= findInMountainArray(1,mountainArray);
        System.out.println("Eeleme -"+ele);
    }
}

class MountainArray{
    List<Integer> arr= Arrays.asList(0,5,3,1);

    public Integer get(int index){
        return arr.get(index);
    }

    public int length(){
        return arr.size();

    }
}

