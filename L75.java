package Leetcode;

public class L75 {
    public void sortColors(int[] nums) {
        int red = 0;
        int i = 0;
        int blue = nums.length - 1;
        int tmp;
        /*swap sort*/
        while(i <= blue){
            if(nums[i] == 0){
                tmp = nums[red];
                nums[red] = 0;
                nums[i] = tmp;
                red ++;
                i++;
            }
            else if(nums[i] == 2){
                tmp = nums[blue];
                nums[blue] = 2;
                nums[i] = tmp;
                blue--;
            }
            else{
                i++;
            }
        }
    }
}
