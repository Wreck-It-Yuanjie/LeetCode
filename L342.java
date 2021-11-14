package Leetcode;

public class L342 {
    public boolean isPowerOfFour(int n) {
        int val = 0;
        while(Math.pow(4, val) < n) val++;
        if(Math.pow(4, val) == n) return true;
        else return false;
    }
}
