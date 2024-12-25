/*
https://leetcode.com/problems/convert-1d-array-into-2d-array/
 */

import java.util.Arrays;

public class OneDTwoArray {


    /**
     *
     *  {1,2,3,4,5,6}
     *
     *  3,2
     *
     *  length/3= 2
     *
     *  2,3
     *
     * @param original
     * @param m
     * @param n
     * @return
     */
    public static int[][] construct2DArray(int[] original, int m, int n) {

        if((m*n)<original.length){
            return new int[][]{};
        }
        int [][]arrRes=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=i*n;j<n;j++){
                arrRes[i][j]=original[(i*n)+j];
            }
        }
        return arrRes;
    }

    public static void main(String[] args) {

        System.out.println(1%1);

        int [] arr={1,2,3,4};

        int m=2;
        int n=2;

        System.out.println(Arrays.toString(construct2DArray(arr,2,2)));
    }
}
