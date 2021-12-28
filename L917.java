package Leetcode;

public class L917 {
    public String reverseOnlyLetters(String s) {
        //two pointers
        int ptr = s.length() - 1;
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                while(ptr > 0 && !Character.isLetter(s.charAt(ptr))) ptr--;
                result.append(s.charAt(ptr));
                ptr--;
            }
            else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
