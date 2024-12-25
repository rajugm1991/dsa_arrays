package arrays;

import java.util.Arrays;

public class FlipImage {


    public static int oddCells(int m, int n, int[][] indices) {
        int [] rows=new int[m];
        int [] col=new int[n];

        for(int[] ar:indices){
            rows[ar[0]]++;
            col[ar[1]]++;
            System.out.println(Arrays.toString(rows));
            System.out.println(Arrays.toString(col));
        }

        System.out.println(Arrays.toString(rows));
        System.out.println(Arrays.toString(col));
        return 0;
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int [][] res=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=image[i].length-1,col=0;j>=0;j--,col++){
                if(image[i][j]==1){
                    res[i][col]=0;
                }else {
                    res[i][col]=1;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {

        int[][] ip={{1,1,0},{1,0,1},{0,0,0}};

        int[][] op=flipAndInvertImage(ip);

        for (int[] ar:op){
            System.out.println(Arrays.toString(ar));
        }

        System.out.println("-------------");
        int [][]indices = {{0,1},{1,1}};

        oddCells(2,3,indices);

    }
}
