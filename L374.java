package Leetcode;

/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

// clarifications

// solution: binary search

public class L374 extends GuessGame {
    public int guessNumber(int n) {
        // define lower and higher bounds
        int low = 1, high = n;

        // binary search
        while(low < high){
            int mid = low + (high - low)/2;

            // if my guess right
            if(guess(mid) == 0){
                return mid;
            }
            // if my guess smaller
            else if(guess(mid) == 1){
                low = mid + 1;
            }
            // if my guess larger
            else{
                high = mid - 1;
            }
        }
        // when low equals to high
        return low;
    }
}

// time complexity : O(log(n))
// space complexity: O(1)

// test case
// n = 3, pick = 3
// low = 1, high = 3, mid = 2, low = 3
//