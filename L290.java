package Leetcode;

// clarification
// length >= 1
// only low case
// single space
// word is not null
// length same?

// solutions
// "abba" --> "dog cat cat dog"
// "abba" !--> "dog cat human dog" 1 !- 2
// "abba" !--> "dog cat dog dog" 2 !- 1
// "abeba" !--> "dog cat dog dog"
// hashmap1 pattern --> s
// hashmap2 s --> pattern
// iterate pattern

import java.util.*;

class L290 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> hashtablePS = new HashMap<>();
        Map<String, Character> hashtableSP = new HashMap<>();

        String[] wordsS = s.split(" ");

        //edge case
        if(wordsS.length != pattern.length()) return false;

        for(int i = 0; i < pattern.length(); i++){
            // pattern --> s
            if(!hashtablePS.containsKey(pattern.charAt(i))){
                hashtablePS.put(pattern.charAt(i), wordsS[i]);
            }
            else if(!hashtablePS.get(pattern.charAt(i)).equals(wordsS[i])){
                return false;
            }
            // s --> pattern
            if(!hashtableSP.containsKey(wordsS[i])){
                hashtableSP.put(wordsS[i], pattern.charAt(i));
            }
            else if(!hashtableSP.get(wordsS[i]).equals(pattern.charAt(i))){
                return false;
            }
        }
        return true;
    }
}

// time complexity : O(N)
// space complexity: O(1)

// test case
// "abba" --> "dog cat cat dog"
// i = 0: hashtablePS: a --> dog; hashtableSP: dog --> a
// i = 1: hashtablePS: a --> dog, b --> cat; hashtableSP: dog --> a, cat --> b
// i = 2: continue
// i = 3: continue
// return true
