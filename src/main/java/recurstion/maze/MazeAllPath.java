package recurstion.maze;

import java.util.Arrays;

public class MazeAllPath {


    static void allPath(String p,boolean [][]reg,int r,int c){

        if(r==reg.length-1&&c==reg[0].length-1){
            System.out.println(p);
            return;
        }

        if(!reg[r][c]){
            return;
        }
        reg[r][c]=false;
        if(r<reg.length-1){
            allPath(p+"D",reg,r+1,c );
        }

        if(c<reg[0].length-1){
            allPath(p+"R",reg,r,c+1 );
        }

        if(r>0){
            allPath(p+"U",reg,r-1,c);
        }

        if(c>0){
            allPath(p+"L",reg,r,c-1);
        }

        reg[r][c]=true;

    }

    static void printArray(String p,boolean [][]reg,int r,int c,int [][] arr,int step){

        if(r==reg.length-1&&c==reg[0].length-1){
            arr[r][c]=step;
            System.out.println(p);
            for(int[] a:arr) {
                System.out.println(Arrays.toString(a));
            }
            return;
        }

        if(!reg[r][c]){
            return;
        }
        reg[r][c]=false;
        arr[r][c]=step;
        if(r<reg.length-1){
            printArray(p+"D",reg,r+1,c ,arr,step+1);
        }

        if(c<reg[0].length-1){
            printArray(p+"R",reg,r,c+1 ,arr,step+1);
        }

        if(r>0){
            printArray(p+"U",reg,r-1,c,arr,step+1);
        }

        if(c>0){
            printArray(p+"L",reg,r,c-1,arr,step+1);
        }

        reg[r][c]=true;
        arr[r][c]=0;
    }



    public static void main(String[] args) {

        boolean[][] reg={{true,true,true},{true,true,true},{true,true,true}};

        int[][] arr=new  int[reg.length][reg[0].length];
        //allPath("",reg,0,0);
        printArray("",reg,0,0,arr,1);
    }
}
