package Leetcode;

public class L905 {
    public int[] sortArrayByParity(int[] nums) {
        /*two passes*/
//         int[] result = new int[nums.length];

//         int writepoint = 0;

//         for(int i = 0; i < nums.length; i++){
//             if(nums[i]%2 == 0){
//                 result[writepoint] = nums[i];
//                 writepoint++;
//             }
//         }
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i]%2 == 1){
//                 result[writepoint] = nums[i];
//                 writepoint++;
//             }
//         }
//         return result;
        /*one pass*/
//         int[] result = new int[nums.length];

//         int low = 0; int high = nums.length - 1;

//         for(int i = 0; i < nums.length; i++){
//             if(nums[i]%2 == 0){
//                 result[low] = nums[i];
//                 low++;
//             }
//             else{
//                 result[high] = nums[i];
//                 high--;
//             }
//         }
//         return result;
        /*one pass, in place (two pointers)*/
        int low = 0; int high = nums.length - 1;
        while(low < high){
            if(nums[low]%2 > nums[high]%2){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
            }

            if(nums[low]%2 == 0) low++;
            if(nums[high]%2 == 1) high--;
        }
        return nums;
    }
}
