import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoDArrays {

    public static void main(String[] args) {





        int [][] arr={{2,3,4},{54,32,55,11},{1,55,6,3}};
        System.out.println(Arrays.toString(search(arr,11)));

        System.out.println("max array "+max(arr));
        System.out.println("min array "+min(arr));

    }

    static int[] search(int [][] arr, int searchValue){

        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
                if(arr[row][col]==searchValue){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int [][]arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
                if(arr[row][col]>max){
                    max= arr[row][col];
                }
            }
        }
        return max;
    }

    static int min(int [][]arr){
        int min=Integer.MAX_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
                if(arr[row][col]<min){
                    min= arr[row][col];
                }
            }
        }
        return min;
    }
}
