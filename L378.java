package Leetcode;

import java.util.*;

// clarifications
// [[1,5,9],[10,11,13],[12,13,15]], k = 8
// matrix is empty? No
// matrix is size 1? Yes
// k > matrix size? No
// all integers? yes
//
// solution 1: sorted array, find the kth smallest value
// time complexity: O(n2) + O(n2logn2) + O(k) = O(n2logn2)
// space complexity: O(n^2)
//
// solution 2: maxheap of size k
// iterate from the last column. maxheap: 13,13,12,11,10,9,5,1 --> 13
// time comlexity: O(klogk)
// space complexity: O(k) < n2
//
// solution 3: binary search
// space complexity: O(1)

class L378 {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> mtrQueue = new PriorityQueue<>(Collections.reverseOrder());

        int csize = matrix[0].length;
        int rsize = matrix.length;

        for(int c = csize - 1; c >= 0; c--){
            for(int r = rsize - 1; r >= 0; r--){
                mtrQueue.add(matrix[r][c]);
                if(mtrQueue.size() > k) mtrQueue.poll();
            }
        }

        return mtrQueue.poll();
    }
}
