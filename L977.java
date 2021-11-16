package Leetcode;

import java.util.*;

public class L977 {
    public int[] sortedSquares(int[] nums) {

        int[] sortArray = new int[nums.length];

        /*Pass 1: square each item*/
        for(int i = 0; i < nums.length; i++){
            sortArray[i] = nums[i]*nums[i];
        }
        /*Pass 2: sort*/
        Arrays.sort(sortArray);

        return sortArray;
    }
}
