package recurstion;

import java.util.Arrays;

public class patt {


    static void printPattern(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*"+ " ");
            printPattern(row,col+1);
        }
        else{
            System.out.println();
            printPattern(row-1,0);
        }

    }

    public static void main(String[] args) {
        printPattern(4,0);

        Integer [] arr={1,2,3,4,5,6};

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,2)));
    }
}
