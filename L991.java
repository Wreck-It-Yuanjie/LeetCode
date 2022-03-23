package Leetcode;

class L991 {
    // greedily divide
    public int brokenCalc(int startValue, int target) {
        int result = 0;
        while(startValue < target){
            result++;
            if(target%2 == 0){
                target /= 2;
            }
            else{
                target += 1;
            }
        }

        return (result + (startValue - target));
    }
}
