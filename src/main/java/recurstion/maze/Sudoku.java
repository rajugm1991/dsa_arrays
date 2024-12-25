package recurstion.maze;

public class Sudoku {



    static boolean sudoku(int[][] board){

        int row=-1;
        int col=-1;

        boolean isElementrFound=true;

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    isElementrFound=false;
                    break;
                }
            }
            if(!isElementrFound){
                break;
            }
        }
        if(isElementrFound){
            return true;
        }

        for(int num=1;num<=9;num++){
            if(isSafe(board,row,col,num)){
                board[row][col]=num;
                if(sudoku(board)){
                    return true;
                }else {
                    board[row][col]=0;
                }
            }

        }

        return false;

    }

    private static boolean isSafe(int[][] board, int row, int col,int num) {

        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[row][i] == num) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[i][col] == num) {
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 0, 0, 0}
        };

        if (sudoku(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }

    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
