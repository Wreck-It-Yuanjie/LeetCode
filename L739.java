package Leetcode;

import java.util.*;

class L739 {
    // stack
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> tempStack = new Stack<>();
        int[] result = new int[temperatures.length];

        tempStack.push(0);

        for(int i = 1; i < temperatures.length; i++){
            while(!tempStack.isEmpty() && temperatures[i] > temperatures[tempStack.peek()]){
                result[tempStack.peek()] = i - tempStack.peek();
                tempStack.pop();
            }

            if(tempStack.isEmpty() || temperatures[i] <= temperatures[tempStack.peek()]) tempStack.push(i);
        }

        while(!tempStack.isEmpty()){
            result[tempStack.pop()] = 0;
        }

        return result;
    }
}

// time complexity: O(N)
// space complexity: O(N)

// 30, 60, 90, 20, 80
// i = 0, 30 stack{0}
// i = 1, 60 result[0] = 1; stack = {1}
// i = 2, 90 result[1] = 1; stack = {2}
// i = 3, 20 stack = {2, 3}
// i = 4, 80 result[3] = 1; stack = {2}; result[2] = 2, stack = {4}
// result[4] = 0;
// result = {1,1,2,1,0}