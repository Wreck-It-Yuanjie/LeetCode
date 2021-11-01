package Leetcode;
import java.util.*;

public class L1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        /*hashmap*/
        HashMap<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            hashtable.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            if(hashtable.containsKey(comp) && i != hashtable.get(comp)){
                result[0] = i;
                result[1] = hashtable.get(comp);
                return result;
            }
        }
        return result;
    }
}
