package Leetcode;

import java.util.*;

class L84 {

    public int largestRectangleArea(int[] heights) {
        // solution 1: two pointers
//         int area = 0;

//         for(int i = 0; i < heights.length; i++){
//             int minHeight = Integer.MAX_VALUE;
//             for(int j = i; j < heights.length; j++){
//                 minHeight = Math.min(minHeight, heights[j]);
//                 area = Math.max(minHeight*(j - i + 1), area);
//             }
//         }

//         return area;

        // solution 2: stack
        int area = 0;
        Stack<Integer> heightStack = new Stack<>();
        heightStack.push(-1);

        for(int i = 0; i < heights.length; i++){

            while((heightStack.peek() != -1) && heights[i] <= heights[heightStack.peek()]){
                // update left and right - width
                int height = heights[heightStack.pop()];
                int width = i - heightStack.peek() - 1;
                // calculate area
                area = Math.max(area, width*height);
            }
            // push height[i] into the stack
            heightStack.push(i);
        }

        // leftover
        while(heightStack.peek() != -1){
            int height = heights[heightStack.pop()];
            int width = heights.length - heightStack.peek() - 1;
            area = Math.max(area, width*height);
            // System.out.println(area);
        }

        return area;
    }
}

// time complexity: O(N)
// space complexity: O(N)