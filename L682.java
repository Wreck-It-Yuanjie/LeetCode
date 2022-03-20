package Leetcode;

import java.util.*;

class L682 {

    Stack<Integer> stack;

    public int calPoints(String[] ops) {
        int sum = 0;

        stack = new Stack<>();

        for(int i = 0; i < ops.length; i++){
            if(ops[i].equals("C")){
                calC();
            }
            else if(ops[i].equals("D")){
                calD();
            }
            else if(ops[i].equals("+")){
                calPlus();
            }
            else{
                stack.push(Integer.valueOf(ops[i]));
            }
        }

        while(!stack.isEmpty()){
            sum += (int) stack.pop();
        }

        return sum;
    }

    private void calC(){
        stack.pop();
    }

    private void calD(){
        int tempPeek = (int)stack.peek();
        stack.push(tempPeek*2);
    }

    private void calPlus(){
        int temp1 = (int)stack.pop();
        int temp2 = (int)stack.peek();

        stack.push(temp1);
        stack.push(temp1 + temp2);
    }
}
