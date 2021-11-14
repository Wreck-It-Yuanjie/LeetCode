package Leetcode;

import java.util.*;

public class L509 {
    HashMap<Integer, Integer> cache = new HashMap<>();
    public int fib(int n) {
        /*recursion with memorization*/
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        //base case
        int result = 0;
        if(n < 2) result = n;
        else result = fib(n - 1) + fib(n - 2);
        cache.put(n, result);

        return result;
    }
}
