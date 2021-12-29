package Leetcode;

public class L925 {
    public boolean isLongPressedName(String name, String typed) {
        //two pointers

        /*edge case*/
        if(name.length() == 0 && typed.length() == 0) return true;
        if(name.length() == 0 || typed.length() == 0) return false;
        if(name.length() > typed.length()) return false;

        /*normal case*/
        int i = 0, j = 0;
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(j - 1 >= 0 && typed.charAt(j) == typed.charAt(j-1)){
                j++;
            }
            else return false;
        }

        /*edge case*/
        if(i == name.length()) return true;
        else return false;
    }
}
