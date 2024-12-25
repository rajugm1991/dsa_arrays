package recurstion.maze;

public class MazeRestrictions {


    static void pathRestriction(String p, boolean[][] restrict,int r ,int c){

        if(r==restrict.length-1&& c==restrict[0].length-1){
            System.out.println(p);
            return;
        }

        if(!restrict[r][c]){
            return;
        }

        if(r<restrict.length-1){
            pathRestriction(p+"D",restrict,r+1,c);
        }

        if(c<restrict[0].length-1){
            pathRestriction(p+"R",restrict,r,c+1);
        }



    }


    public static void main(String[] args) {

        boolean[][] restrict={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };

        pathRestriction("",restrict,0,0);


    }
}
