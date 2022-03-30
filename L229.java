package Leetcode;

// clarification
// edge case 1: n = 0? No
// edge case 2: n = 1? return nums[0]
// edge case 3: n = 2? return nums[0], nums[1]

// brainstorm
// Solution 1: HashMap
// initialize list. iterate the array, update the hashmap. Add nums[i] into the list if its value > n/3
// return list
// time complexity: n
// space complexity: k
//
// Solution 2: sorting
//

import java.util.*;

class L229 {
    public List<Integer> majorityElement(int[] nums) {
        // create the map
        Map<Integer, Integer> numsCount = new HashMap<>();
        // create the result
        List<Integer> result = new ArrayList<>();
        // define n/3
        int requiredLength = nums.length/3;

        // edge case 1: n = 1
        if(nums.length == 1) {
            result.add(nums[0]);
            return result;
        }

        // edge case 2: n = 2
        if(nums.length == 2){
            result.add(nums[0]);
            if(!result.contains(nums[1])) result.add(nums[1]);
            return result;
        }

        // iterate the array
        for(int i = 0; i < nums.length; i++){
            if(!numsCount.containsKey(nums[i])){
                numsCount.put(nums[i], 0);
            }
            numsCount.put(nums[i], numsCount.get(nums[i]) + 1);

            if(numsCount.get(nums[i]) > requiredLength){
                if(!result.contains(nums[i])) result.add(nums[i]);
            }
        }
        return result;
    }
}
