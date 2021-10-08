package Leetcode;

import java.util.Set;
import java.util.HashSet;

class L771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> Jset = new HashSet();
        for (char j: jewels.toCharArray()){
            Jset.add(j);
        }

        int answer = 0;
        for (char s: stones.toCharArray()){
            if(Jset.contains(s)){
                answer ++;
            }
        }
        return answer;
    }
}
