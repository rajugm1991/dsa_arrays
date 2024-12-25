package practice.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackTrackingPath {

    static void path(String p,int[][] board,int r,int c,int step,boolean[][] pathRest){

        if(c==board[0].length-1&&r==board.length-1){
            board[r][c]=step+1;
            printBoard(board);
            System.out.println(p);
            return;
        }


        if(r>board.length||c>board[0].length){
            return;
        }

        if(board[r][c]!=0){
            return ;
        }
        step=step+1;
        board[r][c]=step;
        pathRest[r][c]=true;




        if(r<board.length-1){
            path(p+"D",board,r+1,c,step,pathRest);

        }

        if(r<board.length-1&&c<board[0].length-1) {
            path(p + "X", board, r + 1, c + 1, step, pathRest);
        }
        if(c<board[0].length-1){
            path(p+"R",board,r,c+1,step,pathRest);
        }




        if(r>0){
            path(p+"U",board,r-1,c,step,pathRest);
        }
        if(c>0){
            path(p+"L",board,r,c-1,step,pathRest);
        }
      //  path(p+"U",board,r-1,c-1,step);

        board[r][c]=0;
        pathRest[r][c]=false;

    }

    private static void printBoard(int[][] board) {
        for(int[] col:board){
            System.out.println(Arrays.toString(col));
        }
    }

    public static void main(String[] args) {
        int[][] board=new int[3][3];
        boolean[][] p=new boolean[3][3];
        path("",board,0,0,0,p);




    }
}
