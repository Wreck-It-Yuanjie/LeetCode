package Leetcode;

import java.util.*;

public class L70 {
    HashMap<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) {

        if(cache.containsKey(n)) return cache.get(n);

        //base case
        int result;
        if(n<=3) result = n;
        else result = climbStairs(n-1) + climbStairs(n-2);

        cache.put(n, result);

        return result;
    }
}
