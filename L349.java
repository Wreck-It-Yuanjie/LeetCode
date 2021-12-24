package Leetcode;

import java.util.*;

public class L349 {
    //two sets
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }

        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int j = 0; j < nums2.length; j++){
            set2.add(nums2[j]);
        }

        if(set1.size() > set2.size()) return helper(set1, set2);
        else return helper(set2, set1);
    }

    public int[] helper(HashSet<Integer> set1, HashSet<Integer> set2){
        int[] answer = new int[set1.size()];
        int index = 0;
        for(Integer s : set1){
            if(set2.contains(s)){
                answer[index] = s;
                index++;
            }
        }
        return Arrays.copyOf(answer, index);
    }
}
