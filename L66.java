package Leetcode;

public class L66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n-1] != 9){
            digits[n-1] ++;
            return digits;
        }
        else{
            int flag = 0;
            for(int i = n-1; i >= 0; i--){
                if (digits[i] == 9){
                    digits[i] = 0;
                    flag = 1;
                    if(i == 0){
                        int[] newd = new int[n+1];
                        newd[0] = 1;
                        return newd;
                    }
                }
                else{
                    if(flag == 1){
                        digits[i] ++;
                        return digits;
                    }
                }
            }
        }
        return digits;
    }
}
