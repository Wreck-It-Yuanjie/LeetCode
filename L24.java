package Leetcode;
import java.util.Arrays;

public class L24 {
    public int removeElement(int[] nums, int val) {
        /*sort the array*/
        Arrays.sort(nums);
        /*find the first one*/
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int len = nums.length;
        while(start <= end){
            mid = start + (end - start)/2;
            if ((nums[mid] == val && mid == 0) || (nums[mid] == val && mid == nums.length - 1) || (nums[mid] == val && nums[mid - 1] != val)){
                System.out.println("Mid: " + mid);
                break;
            }
            if(nums[mid] > val || (nums[mid] == val && nums[mid - 1] == val)){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        /*find the rest*/
        int flag = 0;
        for(int i = mid; i < nums.length; i++){
            if(nums[i] != val){
                // len = nums.length - (i - mid);
                // System.out.println(flag);
                nums[mid + flag] = nums[i];
                flag ++;
            }
            else{
                len --;
            }
        }
        return len;
    }
}
