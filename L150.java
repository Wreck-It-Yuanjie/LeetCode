package Leetcode;

import java.util.*;

// clarification questions
// reversed polish notation definition
// ["2","1","+","3","*"] --> (2+1)*3 = 9
// ["4","13","5","/","+"] --> 4+(13/5) = 6
// []? Not possible
// ["4"]? Yes
// /0? Not possible
// only 4 operations: +, -, *, /

// brainstorm
// four functions: "+" --> +, ...
// initialize an empty Stack tokenStack
// iterate the array, and push every element into tokenStack until it encounters the first opertor
// bottom 4 - 13 - 5
// "/" --> pop the previous two elements and do z = x/y -- push z into tokenStack
// bottom 4 - 2
// "+" --> pop the previous two elements and do z = x + y
// when we finish iterating the token array, we return z
// time complexity: O(N)
// space complexity: O(N)

class L150 {
    public int evalRPN(String[] tokens) {

        int result = 0;

        Stack<Integer> tokenStack = new Stack<>();

        // check if we need this edge case in the end
        if(tokens.length == 1){
            return Integer.valueOf(tokens[0]);
        }

        for(int i = 0; i < tokens.length; i++){
            if(!"+-*/".contains(tokens[i])){
                tokenStack.push(Integer.valueOf(tokens[i]));
            }
            else{
                int n2 = tokenStack.pop();
                int n1 = tokenStack.pop();

                switch (tokens[i]){
                    case "+":
                        result = n1 + n2;
                        break;
                    case "-":
                        result = n1 - n2;
                        break;
                    case "*":
                        result = n1*n2;
                        break;
                    case "/":
                        result = n1/n2;
                        break;
                }

                tokenStack.push(result);

            }
        }

        return result;
    }
}
