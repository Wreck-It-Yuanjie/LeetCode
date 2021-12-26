package Leetcode;

import java.util.*;

public class L20 {
    public boolean isValid(String s) {
        HashMap<Character, Character> hashtable = new HashMap<>();

        hashtable.put(')', '(');
        hashtable.put(']', '[');
        hashtable.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(hashtable.containsKey(c)) {
                if(stack.empty() == true || stack.pop() != hashtable.get(c)) return false;
            }
            else stack.push(c);
        }
        return (stack.empty() == true);
    }
}
