package Leetcode;

import java.util.*;

public class L703 {
    class KthLargest {

        private int k;
        private Queue<Integer> minheap;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            minheap = new PriorityQueue<>();

            // build the priority queue
            for(int i = 0; i < nums.length; i++){
                minheap.add(nums[i]);
                if(minheap.size() > k){
                    minheap.poll();
                }
            }
        }

        public int add(int val) {
            minheap.add(val);
            if(minheap.size() > k){
                minheap.poll();
            }

            return minheap.peek();
        }
    }
}
