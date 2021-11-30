package Leetcode;

import java.util.*;

public class L448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result= new ArrayList<>();
        HashSet<Integer> orderedNum = new HashSet<>();

        /*two passes*/
        for(int i = 0; i < nums.length; i++){
            orderedNum.add(nums[i]);
        }

        for(int i = 1; i <= nums.length; i++){
            if(orderedNum.contains(i) == false){
                result.add(i);
            }
        }

        return result;
    }
}
