package arrays;

public class MatDiag {


    public static int rowDiag(int r,int c,int[][] mat){
        if(r>mat.length-1){
            return 0;
        }
        int val=mat[r][c];
        return val+rowDiag(r+1,c+1,mat);
    }


    public static int revDiag(int r,int c,int[][] mat){
        if(r>mat.length-1){
            return 0;
        }
        int val=0;
        if(r!=c) {
            val = mat[r][c];
        }
        return val+revDiag(r+1,c-1,mat);
    }


    public static void main(String[] args) {
       int[][] mat = {{1,2,3},
               {4,5,6},
        {7,8,9}};

       int num=2000;
        int numOfDigit=(int)Math.log10(num)+1;
        if((    numOfDigit&1)==0){

        }
        System.out.println(rowDiag(0,0,mat));
        System.out.println(revDiag(0,mat.length-1,mat));
    }
}
