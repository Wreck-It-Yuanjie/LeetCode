package Leetcode;

import java.util.*;

class L46 {
    // backtracking
    // other solution : can optimize it - repeating values
    public List<List<Integer>> permute(int[] nums) {
        // change nums to list
        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            numList.add(nums[i]);
        }

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        int index = 0;

        backtrack(result, numList, temp, index);

        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> numList, List<Integer> temp, int index){
        // base case

        if(index == numList.size()){
            System.out.println(temp);

            List<Integer> temp1 = new ArrayList<>(temp);

            result.add(temp1);
        }

        // recursive case
        for(int i = 0; i < numList.size(); i++){
            if(!temp.contains(numList.get(i))){
                temp.add(numList.get(i));

                backtrack(result, numList, temp, index + 1);

                temp.remove(temp.size() - 1);
            }
        }

    }
}
