package Leetcode;

class L33 {
    // binary search
    public int search(int[] nums, int target) {

        // edge case 1:
        if(nums.length == 0) return -1;
        if(nums.length == 1 && target == nums[0]) return 0;
        if(nums.length == 1 && target != nums[0]) return -1;

        // find k
        int k = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]) k = i;
        }

        // binary search
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;

            int midTrans = mid + k >= nums.length? mid + k - nums.length : mid + k;

            if(nums[midTrans] == target){
                return midTrans;
            }

            else if(nums[midTrans] < target){
                left = mid + 1;
            }

            else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
