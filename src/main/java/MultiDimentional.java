import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentional {

    public static void main(String[] args) {

        int [][] arr=new int[3][];

        /**
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        /**
         *
         * Array of arrays:
         *
         *  row- is mandatory
         *
         *  col- can be vary
         *  i.e ar2[1]={4,5,6,7,8,9}
         *
         *  ar2[0]={1,2,3}
         *  ar2[1]={4,5,6}
         *  ar2[2]={7,8,9}
         *
         */
        int [][] ar2={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(ar2[2][2]);


        int [][]ar3=new int[3][3];

        Scanner scanner=new Scanner(System.in);

//        for(int row=0;row<ar3.length;row++){
//            for (int col=0;col<ar3[row].length;col++){
//                ar3[row][col]=scanner.nextInt();
//            }
//        }

        for (int[] ints : ar3) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        int []array={1,2,4,5,6,7,8,3};

        //swap(array,0,3);
        reverse(array);

        System.out.println(Arrays.toString(array));



    }

    static void reverse(int[] arr){

        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }


    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
