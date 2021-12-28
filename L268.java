package Leetcode;

public class L268 {
    public int missingNumber(int[] nums) {
        //sorting
//         int size = nums.length;
//         Arrays.sort(nums);

//         for(int i = size - 1; i >= 0; i--){
//             if(nums[0] != 0) return 0;

//             if(nums[i] != i + 1) return i + 1;
//         }
//         return -1;
        //hashset
        // HashSet<Integer> hashtable = new HashSet<>();
        // //build the hashset
        // for(int i = 0; i < nums.length; i++){
        //     hashtable.add(nums[i]);
        // }
        // //iterate
        // for(int i = 0; i < nums.length + 1; i++){
        //     if(hashtable.contains(i) != true) return i;
        // }
        // return -1;
        //Gauss's formula
        int expectValue = (nums.length + 1)*nums.length/2;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        return expectValue - sum;
    }
}
