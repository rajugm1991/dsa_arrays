package recurstion.maze;

public class Nqueen2 {


    static int queenPath(boolean[][] board,int row){

        if(row==board.length){
            printBoard(board);
            System.out.println();
            return 1;
        }

        int count=0;
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queenPath(board,row+1);
                board[row][col]=false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        //vertical
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        //leftDiagonal
        int leftDiagnol=Math.min(row,col);
        for(int i=1;i<=leftDiagnol;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        //leftDiagonal
        int rightDiagnol=Math.min(row,board.length-col-1);
        for(int i=1;i<=rightDiagnol;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void printBoard(boolean[][] board) {
        for(boolean[] b:board){
            for(boolean a:b){
                if(a){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n=8;

        boolean[][] board=new boolean[n][n];

        System.out.println(queenPath(board,0));
    }
}
