package Leetcode;

import java.util.*;

public class L17 {
    // backtracking
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Character, String> dMap = Map.of('2', "abc", '3', "def", '4', "ghi",
                '5', "jkl", '6', "mno", '7', "pqrs",
                '8', "tuv", '9', "wxyz");

        // define a temp string
        String temp = "";

        if(digits.length() > 0){
            backtrack(digits, result, dMap, temp);
        }

        return result;
    }

    private void backtrack(String digits, List<String> result, Map<Character, String> dMap, String temp){

        // base case
        if(digits.length() == 0){
            result.add(temp);
        }

        else{
            String ele = dMap.get(digits.charAt(0));

            // recursive case
            for(int j = 0; j < ele.length(); j++){
                temp += ele.charAt(j);
                backtrack(digits.substring(1), result, dMap, temp);
                temp = temp.substring(0, temp.length() - 1);
            }
        }
    }
}
