package Leetcode;

import java.util.*;

// clarifications
// m = 0, n = 0? No
// m = 1, n = 1? No
// starts from 2
// k > m? No
// other values except for 0 and 1? No
//
// Solution 1: linear search + treemap
// traverse each row and find the weakness, put the weakness and row index into the treemap
// treemap: {1, 2; 2: 0, 3; 4, 1; 5, 4}
// iterate treemap keys and output the first k values
// if k = 3, output 2, 0, 3
// time comlexity: O(mn) + O(mlog m) = O(m(logm+n))
// space complexity: O(m)
//
// Solution 2: binary search + treemap
// binary search the row to find the weakness, put the weakness and row index into the treemap
// time complexity: O(mlogn) + O(mlogm) = O(m(logmn))
// space complexity: O(m)
//
// Solution 3: binary search + maxheap
// binary search the row to find the weakness, put row index into a maxheap (size = k)
// output the k largest indexes in reversed order
// time complexity: O(mlogn) + O(mlogk) = O(m(lognk))
// space complexity: O(k)
//
// Solution 4: vertical order search
// vertically traverse the matrix, if encounter a 0 with prev 1, put it into the result set
// edge case: if the row is full
// time complexity: O(mn)
// space complexity: O(1)

class L1337 {
    // binerary search find the weakness
    public int binarySearch(int[] nums){
        int left = 0, right = nums.length;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == 1){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }

    // use treemap
//     public int[] kWeakestRows(int[][] mat, int k) {

//         int[] result = new int[k];

//         Map<Integer, List<Integer>> countMap = new TreeMap<>();

//         // calculate weakness and add to the map
//         for(int i = 0; i < mat.length; i++){
//             int weakness = binarySearch(mat[i]);
//             if(!countMap.containsKey(weakness)){
//                 countMap.put(weakness, new ArrayList<Integer>());
//             }
//             countMap.get(weakness).add(i);
//         }

//         // System.out.println(countMap);

//         int j = 0;
//         // iterate the map and add to the result
//         for(Integer key : countMap.keySet()){
//             for(int index : countMap.get(key)){
//                 result[j] = index;
//                 j++;
//                 if(j == k){
//                     break;
//                 }
//             }
//             if(j == k){
//                 break;
//             }
//         }

//         return result;
//     }

    // use priority queue
    public int[] kWeakestRows(int[][] mat, int k){
        // create a max priority queue
        Queue<int[]> count = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]) return b[1] - a[1];
            else return b[0] - a[0];
        });

        // build the queue of size k
        for(int i = 0; i < mat.length; i++){
            int weakness = binarySearch(mat[i]);
            count.add(new int[]{weakness, i});
            if(count.size() > k){
                count.poll();
            }
        }

        // push values out of the queue in reversed order
        int[] result = new int[k];
        for(int j = k - 1; j >= 0; j--){
            result[j] = count.poll()[1];
        }

        return result;
    }
}