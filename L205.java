package Leetcode;

import java.util.*;

// clarifications
// egg --> adg
// lowcase, highcase

// solutions
// HashMap: store the pair
// hashtable: e:a, g:d
// iterate s and t, check the pair with t
// if not the same, return false
// return true

class L205 {
    public boolean isIsomorphic(String s, String t) {
        // hashmap
        Map<Character, Character> hashtable1 = new HashMap<>();
        Map<Character, Character> hashtable2 = new HashMap<>();

        //iterate s and t
        for(int i = 0; i < s.length(); i++){
            if(!hashtable1.containsKey(s.charAt(i))){
                //create new pair
                hashtable1.put(s.charAt(i), t.charAt(i));
            }
            else if(!hashtable1.get(s.charAt(i)).equals(t.charAt(i))){
                // if not the same, return false
                return false;
            }

            if(!hashtable2.containsKey(t.charAt(i))){
                //create new pair
                hashtable2.put(t.charAt(i), s.charAt(i));
            }
            else if(!hashtable2.get(t.charAt(i)).equals(s.charAt(i))){
                // if not the same, return false
                return false;
            }

        }
        return true;
    }
}

// testcase : egg --> adg
// i = 0; hashtable : e:a
// i = 1; hashtable : g:d
// i = 2; d!=g return false

// testcase : paper --> title
// i = 0; hashtable : p : t
// i = 1; hashtable : a : i
// i = 2; t==t
// i = 3; hashtable : e : l
// i = 4; hashtable : r : e
// return true

// time complexity : O(N)
// space complexity: O(1)
