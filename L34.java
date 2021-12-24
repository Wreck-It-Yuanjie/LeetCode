package Leetcode;

class L34 {
    public int[] searchRange(int[] nums, int target) {
        //binary search
        int start = helper(nums, target, true);

        if(start == -1) return new int[]{-1, -1};

        int end = helper(nums, target, false);

        return new int[]{start, end};
    }

    public int helper(int[] nums, int target, boolean isFirst){
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                //finding the lower bound
                if(isFirst == true){
                    if(mid == left || nums[mid - 1] != target) return mid;
                    else right = mid - 1;
                }
                //finding the upper bound
                else{
                    if(mid == right || nums[mid + 1] != target) return mid;
                    else left = mid + 1;
                }
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
