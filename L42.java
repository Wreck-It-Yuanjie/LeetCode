package Leetcode;

public class L42 {
    public int trap(int[] height) {
        /*define two pointers*/
        int left = 0, right = height.length - 1;
        /*define volume*/
        int sum = 0;
        /*define max left and max right*/
        int max_left = 0, max_right = 0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= max_left){
                    max_left = height[left];
                }
                else{
                    sum += (max_left - height[left]);
                }
                left++;
            }
            else{
                if(height[right] >= max_right){
                    max_right = height[right];
                }
                else{
                    sum += (max_right - height[right]);
                }
                right--;
            }
        }

        return sum;
    }
}
