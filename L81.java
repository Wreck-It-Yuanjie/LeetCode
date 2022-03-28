package Leetcode;

import java.util.*;

class L81 {
    // binary search
//    public boolean search(int[] nums, int target) {
//
//        // edge case 1
//        if(nums.length == 0) return false;
//
//        // edge case 2
//        if(nums.length == 1 && target != nums[0]) return false;
//        if(nums.length == 1 && target == nums[0]) return true;
//
//        // find the right order
//        List<Integer> numSort = new ArrayList<>();
//
//        int index1 = 1;
//        int index2 = 0;
//        numSort.add(nums[0]);
//
//        for(index1 = 1; index1 < nums.length; index1++){
//            if(nums[index1] >= nums[index1-1]){
//                numSort.add(nums[index1]);
//            }
//            else{
//                break;
//            }
//        }
//
//        for(int j = index1; j < nums.length; j++){
//            numSort.add(index2, nums[j]);
//            index2++;
//        }
//
//        // binary search
//        // System.out.println(numSort);
//
//        int left = 0, right = numSort.size() - 1;
//        while(left <= right){
//            int mid = left + (right - left)/2;
//
//            if(numSort.get(mid) == target){
//                return true;
//            }
//
//            else if(numSort.get(mid) < target){
//                left = mid + 1;
//            }
//
//            else{
//                right = mid - 1;
//            }
//        }
//
//        return false;
//    }

    // binary search without writing another list
    public boolean search(int[] nums, int target) {

        // edge case 1: length == 0
        if(nums.length == 0) return false;

        // edge case 2: length == 1
        if(nums.length == 1 && target == nums[0]) return true;
        if(nums.length == 1 && target != nums[0]) return false;

        // find k
        int k = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                k = i;
            }
        }

        // System.out.println(k);

        // binary search
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            int midTrans = mid + k >= nums.length? mid + k - nums.length : mid + k;

            if(nums[midTrans] == target){
                return true;
            }
            else if(nums[midTrans] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return false;
    }
}
