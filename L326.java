package Leetcode;

public class L326 {
    public boolean isPowerOfThree(int n) {
        /*iteration*/
        int val = 0;
        while(Math.pow(3, val) < n){
            val++;
        }

        if(Math.pow(3,val) == n) return true;
        else return false;
    }
}
