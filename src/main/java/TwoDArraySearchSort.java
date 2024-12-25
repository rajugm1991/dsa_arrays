import java.util.Arrays;

public class TwoDArraySearchSort {

    static int[] binarySearch(int [][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }

        }

        return new int[]{-1,-1};
    }

    static  int[] twoDArrSearch(int [][] arr,int target){
        int rowSize=arr.length-1;
        if(rowSize==0){
            return binarySearch(arr,rowSize,0,arr[rowSize].length-1,target);
        }

        int rStart=0;
        int rEnd=rowSize;
        int cMid=arr.length/2;
        while (rStart<(rEnd-1)){
            int mid = rStart + (rEnd - rStart) / 2;
            if(arr[rStart][mid]==target){
                return new int[]{rStart,cMid};
            }
            if(arr[rStart][mid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        int cols = arr[0].length; // be cautious, matrix may be empty

        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return binarySearch(arr, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }

    }

    /**
     *
     *  1 2 3 4
     *  5 6 7 8
     *  9 10 11 12
     *  13 14 15 16
     *
     * @param args
     */
    public static void main(String[] args) {

        int [][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(twoDArrSearch(arr,10)));

    }
}
