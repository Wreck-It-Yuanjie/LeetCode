package Leetcode;

import java.util.*;

public class L719 {
//    public int smallestDistancePair(int[] nums, int k) {
//        //brutal force
//        Arrays.sort(nums);
//
//        int maxV = nums[nums.length - 1];
//
//        int[] count = new int[maxV + 1];
//
//        /*calculate frequencies*/
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1; j < nums.length; j++){
//                count[nums[j] - nums[i]]++;
//            }
//        }
//
//        /*find the value*/
//        for(int i = 0; i < count.length; i++){
//            k = k - count[i];
//            if(k <= 0) return i;
//        }
//
//        return 0;
//    }

    public int smallestDistancePair(int[] nums, int k) {
        //binary search + two pointers
        /*sort the array*/
        Arrays.sort(nums);

        /*binary search*/
        int lo = 0, hi = nums[nums.length - 1] - nums[0];

        while(lo < hi){
            int mid = (lo + hi)/2;
            int left = 0, count = 0;
            for(int right = 0; right < nums.length; right++){
                while(nums[right] - nums[left] > mid) left++;
                count = count + right - left;
            }
            /*count is the number of pairs with distance <= mi*/
            if(count >= k) hi = mid;
            else lo = mid+1;
        }
        return hi;
    }
}
