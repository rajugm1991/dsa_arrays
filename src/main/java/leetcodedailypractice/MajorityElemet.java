package leetcodedailypractice;

import java.util.HashMap;
import java.util.Map;

public class MajorityElemet {

    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else
            map.put(nums[i],1);
        }
        for(int val:map.values()){
            if(val>(nums.length/2)){
                return val;
            }
        }
        System.out.println(map);
        return -1;
    }

    public static void main(String[] args) {
       int  []nums={2,2,1,1,1,2,2};
       majorityElement(nums);

    }
}
