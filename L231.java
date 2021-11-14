package Leetcode;

public class L231 {
    public boolean isPowerOfTwo(int n) {
        /*iteration*/
        int val = 0;
        while(Math.pow(2, val) < n){
            val++;
        }
        if(Math.pow(2, val) > n) return false;
        else return true;
    }
}
