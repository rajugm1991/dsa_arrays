package recurstion.maze;

public class Maze {


    static int count(int r,int c){

        if(r==1||c==1){
            return 1;
        }

        int left=count(r-1,c);
        int right=count(r,c-1);

        return left+right;
    }

    static void goDiagonal(String p, int r,int c){

        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            goDiagonal(p+"D",r-1,c);
        }

        if(c>1){
            goDiagonal(p+"R",r,c-1);
        }

        if(r>1&&c>1){
            goDiagonal(p+"D",r-1,c-1);
        }

    }

    static void print(String p,int r, int c){

        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            print(p+"R",r-1,c);
        }
        if(c>1){
            print(p+"D",r,c-1);
        }


    }

    public static void main(String[] args) {

        System.out.println(count(3,3));
        print("",3,3);
        System.out.println("Diagonal");
        goDiagonal("",3,3);
    }
}
