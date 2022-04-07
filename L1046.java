package Leetcode;

import java.util.*;

public class L1046 {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        // build the maxheap
        for(int stone : stones){
            maxheap.add(stone);
        }

        while(maxheap.size() > 0){
            // whether the maxheap size = 1
            if(maxheap.size() == 1){
                return maxheap.poll();
            }
            else{
                int n1 = maxheap.poll();
                int n2 = maxheap.poll();

                int ntemp = n1 - n2;

                if(ntemp > 0){
                    maxheap.add(ntemp);
                }
            }
        }

        return 0;
    }
}
