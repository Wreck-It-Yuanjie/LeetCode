package Leetcode;

import java.util.*;

class L1394 {
    public int findLucky(int[] arr) {
        int maxValue = -1;
        HashMap<Integer, Integer> hashtable = new HashMap<>();

        //two pass
        //build a hashmap
        for(int i = 0; i < arr.length; i++){
            hashtable.put(arr[i], hashtable.getOrDefault(arr[i], 0) + 1);
        }

        //iterate the hashmap
        for(Map.Entry<Integer, Integer> set: hashtable.entrySet()){
            // System.out.println(set.getKey() + "," + set.getValue());
            if(set.getKey() == set.getValue()){
                maxValue = Math.max(maxValue, set.getKey());
            }
        }

        return maxValue;
    }
}
