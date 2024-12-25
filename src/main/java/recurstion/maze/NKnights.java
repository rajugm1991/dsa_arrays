package recurstion.maze;

public class NKnights {


    //column wise
    static void printKnight2(boolean[][] board,int row ,int col, int track){

        if(track==0){
            printBoard(board);
            System.out.println();
            return;
        }

        if(row==board.length){
            return;
        }

        if(col==board[0].length){
            printKnight(board,row+1,0,track);
            return;
        }

        if(isRightPlace(board,row,col)){
            board[row][col]=true;
            printKnight(board,row,col+1,track-1);
            board[row][col]=false;
        }
        printKnight(board,row,col+1,track);

    }

    static void printKnight(boolean[][] board,int row ,int col, int track){

        if(track==0){
            printBoard(board);
            System.out.println();
            return;
        }

        if(row==board.length){
            return;
        }

        if(col==board[0].length){
            printKnight(board,row+1,0,track);
            return;
        }

        if(isRightPlace(board,row,col)){
            board[row][col]=true;
            printKnight(board,row,col+1,track-1);
            board[row][col]=false;
        }
        printKnight(board,row,col+1,track);

    }

    private static boolean isRightPlace(boolean[][] board, int row, int col) {
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }

        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }

        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if(row>=0&&row<board.length&&col>=0&&col<board[0].length){
            return true;
        }
        return false;
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

        int n=4;
        boolean[][] board=new boolean[n][n];
        printKnight(board,0,0,4);
    }
}
