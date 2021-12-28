package Leetcode;

public class L680 {
    public boolean validPalindrome(String s) {
        //two pointers
        boolean flag = false;
        for(int left = 0, right = s.length() - 1; left < right; left++, right--){
            if(flag == true && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            if(flag == false && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return helper(s, left+1, right) || helper(s, left, right-1);
            }
        }
        return true;
    }

    public boolean helper(String s, int left, int right){
        while(left < right){
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            else{
                left++; right--;
            }
        }
        return true;
    }
}
