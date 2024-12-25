package practice.recursion;

public class Practice {

    static void print (int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    static void print2 (int n){
        if(n==0){
            return;
        }
        print2(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print2(5);
    }
}
