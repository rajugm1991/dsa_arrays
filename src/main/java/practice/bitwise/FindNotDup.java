package practice.bitwise;

public class FindNotDup {


    static int findNum(int[] arr){
        int res=0;
        for(int a: arr){
            res=res^a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(3^5);
        int[] ar={2,3,2,3,5};

        System.out.println(findNum(ar));

        System.out.println(9&(8<<1));
        System.out.println(Integer.toBinaryString(-1));
    }
}
