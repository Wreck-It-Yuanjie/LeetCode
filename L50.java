package Leetcode;

class L50 {
    // fast recursion
    public double myPow(double x, int n) {
        long N = n;
        double result = 1.0;

        if(N < 0){
            x = 1.0/x;
            N = -N;
        }

        return helper(x, N);
    }

    private double helper(double x, long n){
        if(n == 0){
            return 1.0;
        }

        double halfResult = helper(x, n/2);

        if(n%2 == 0){
            return halfResult*halfResult;
        }
        else{
            return halfResult*halfResult*x;
        }
    }
}
