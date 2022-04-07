package Leetcode;

import java.util.*;

public class L347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> freqMap = new HashMap<>();
        Queue<Integer> minheap = new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));

        // build the hashmap
        for(int i = 0; i < nums.length; i++){
            if(!freqMap.containsKey(nums[i])){
                freqMap.put(nums[i], 0);
            }
            freqMap.put(nums[i], freqMap.get(nums[i]) + 1);
        }

        // build the minheap
        for(int n : freqMap.keySet()){
            minheap.add(n);
            if(minheap.size() > k) minheap.poll();
        }

        for(int j = 0; j < k; j++){
            result[j] = minheap.poll();
        }

        return result;
    }
}
