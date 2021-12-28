package Leetcode;

import java.util.*;

class L455 {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int sum = 0;

        if(g.length == 0 || s.length == 0) return 0;

        while(i < g.length && j < s.length){
            if(g[i] <= s[j]){
                sum++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        return sum;
    }
}
