package Leetcode;

public class L283 {
    public void moveZeroes(int[] nums) {
        /*two pointers*/
        int writepoint = 0;
        for(int readpoint = 0; readpoint < nums.length; readpoint ++){
            if(nums[readpoint] != 0){
                nums[writepoint] = nums[readpoint];
                writepoint++;
            }
        }
        for(int i = writepoint; i < nums.length;i++) nums[i] = 0;
    }
}
