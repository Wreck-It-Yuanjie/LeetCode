package Leetcode;

class L441 {
    public int arrangeCoins(int n) {
        long left = 0, right = n;
        long sum = 0;

        if(n == 0) return 0;

        while(left <= right){
            long mid = left + (right - left)/2;
            sum = (1 + mid)*mid/2;
            if(sum == n) return (int) mid;
            else if(sum > n) right = mid - 1;
            else left = mid + 1;
        }
        return (int)right;
    }
}

// test case
// n = 5
// row = 1, tempAdd = 1, sum = 1
// row = 2, tempAdd = 2, sum = 3
// row = 3, tempAdd = 3, sum = 6
