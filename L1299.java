package Leetcode;

public class L1299 {
    public int[] replaceElements(int[] arr) {
        /*one pass*/
        for(int i = 0; i < arr.length -1; i++){
            int maxRight = arr[i + 1];
            for(int j = i+2; j < arr.length; j++){
                if(maxRight < arr[j]) maxRight = arr[j];
            }
            arr[i] = maxRight;
        }

        arr[arr.length - 1] = -1;

        return arr;
    }
}
