package bitwise;

public class OddEven {

    public static void main(String[] args) {
        int n=19;
        System.out.println(isOdd(n));

        //dup
        int []arr={2,3,4,1,2,1,4,6,3};

        System.out.println(dup(arr));

        //count set bits

        System.out.println(countBit(15));

        System.out.println(Integer.toBinaryString(-10));

    }

    private static int countBit(int n) {
        int count=0;
        while (n>0){
            if((n&1)==1){
                count++;
            }
           n= n>>1;
        }
        return count;
    }

    private static boolean isOdd(int n) {
        return (n&1)==1;
    }

    //a^a=0;
    private static int dup(int[] arr){
        int res=0;
        for(int a:arr){
            res=res^a;
        }
        return res;
    }
}
