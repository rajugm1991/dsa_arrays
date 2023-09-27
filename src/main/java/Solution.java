import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * Bit wise:
 *
 *  2^2=0
 *  2^3=5
 *
 * 2-00000010
 * 3-00000011
 * XOR-> same will true if not false
 * 1-00000001
 */

public class Solution {

    public static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int ar[]={2,1,2};
        System.out.println(9^8);
    }
}
