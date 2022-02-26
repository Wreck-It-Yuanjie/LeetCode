package Leetcode;

import java.util.*;

public class L22 {
    // backtracking
    public List<String> generateParenthesis(int n) {
        String temp = "";
        List<String> result = new ArrayList<>();

        backtrack(n, 0, 0, temp, result);
        return result;
    }

    private void backtrack(int n, int open, int close, String temp, List<String> result){
        //base case
        if(open == n && close == n){
            result.add(temp);
            return;
        }

        //recursive case
        if(open < n){
            temp += "(";
            backtrack(n, open+1, close, temp, result);
            temp = temp.substring(0, temp.length() - 1);
        }

        if(close < open){
            temp += ")";
            backtrack(n, open, close+1, temp, result);
            temp = temp.substring(0, temp.length() - 1);
        }
    }
}
