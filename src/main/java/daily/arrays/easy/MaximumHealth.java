package daily.arrays.easy;

public class MaximumHealth {

    public  static  int maximumWealth(int[][] accounts) {

        int greater=0;
        for(int row=0;row<accounts.length;row++){
            int sum=0;
            for(int col=0;col<accounts[row].length;col++){
                sum+=accounts[row][col];
            }
            if(sum>greater){
                greater=sum;
            }
        }
        return greater;
    }
    public static void main(String[] args) {

        int[][] arr={{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(arr));

    }
}
