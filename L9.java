package Leetcode;

public class L9 {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else{
            String xs = String.valueOf(x);
            for(int i = 0; i < xs.length()/2; i++){
                if(xs.charAt(i) != xs.charAt(xs.length()-i-1)){
                    return false;
                }
            }
            return true;
        }
    }
}
