package recurstion.maze;

public class Nqueen {


    static int queen(boolean[][] board,int row){
        if(row==board.length){
            print(board);
            System.out.println();
            return 1;
        }

        int count=0;
        for(int col=0;col<board.length;col++){
            if(isRightPlace(board,row,col)){
                board[row][col]=true;
                count+=queen(board,row+1);
                board[row][col]=false;
            }

        }
        return count;
    }

    private static boolean isRightPlace(boolean[][] board, int row, int col) {

        //vertical
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        //left side

        int maxLeft=Math.min(row,col);

        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }


        //right side

        int maxRight=Math.min(row,board.length-col-1);

        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void print(boolean[][] board) {

        for (boolean[] b:board){
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

        int n=4;
        boolean[][] board=new boolean[n][n];

        System.out.println(queen(board,0));
    }
}
