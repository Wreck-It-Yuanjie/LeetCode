package Leetcode;

public class L941 {
    public boolean validMountainArray(int[] arr) {
        /*two pass*/
        if(arr.length <= 2) return false;

        //pass 1: find the largest value and index
        int maxindex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[maxindex]) maxindex = i;
        }

        if(maxindex == 0 || maxindex == arr.length - 1) return false;

        //pass 2: find whether it's strictly increasing (left) and decreasing (right)
        int leftsumd = 0;
        for(int i = 1; i < maxindex; i++){
            if(arr[i] <= arr[i-1]) leftsumd++;
        }

        int rightsumi = 0;
        for(int i = maxindex + 1; i < arr.length; i++){
            if(arr[i] >= arr[i-1]) rightsumi++;
        }

        if(leftsumd == 0 && rightsumi == 0) return true;
        else return false;

    }
}
