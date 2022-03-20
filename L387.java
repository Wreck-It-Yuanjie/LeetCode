package Leetcode;

import java.util.*;

class L387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> mapFreq = new HashMap<>();

        // iterate the string
        for(int i = 0; i < s.length(); i++){
            mapFreq.put(s.charAt(i), mapFreq.getOrDefault(s.charAt(i), 0) + 1);
        }

        // find the index
        for(int i = 0; i < s.length(); i++){
            if(mapFreq.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
