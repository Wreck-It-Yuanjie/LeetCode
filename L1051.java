package Leetcode;

import java.util.*;

public class L1051 {
    public int heightChecker(int[] heights) {
        /*sort, new array*/
        int result = 0;
        int[] expected = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            expected[i] = heights[i];
        }

        Arrays.sort(expected);

        for(int i = 0; i < expected.length; i++){
            if(expected[i] != heights[i]) result++;
        }
        return result;
    }
}
