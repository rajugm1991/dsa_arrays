import java.util.Arrays;

public class TwoDArraySearch {


    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(search(arr, 100)));

    }

    static int[] search(int[][] arr,int target){

        int r=0;
        int c=arr.length-1;

        while (c>=0&&r<arr.length){

            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            else if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
