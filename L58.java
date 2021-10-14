package Leetcode;

class L58 {
    public int lengthOfLastWord(String s) {
        /*Solution 1: split*/
//         String[] splited = s.split("\\s+");
//         String lastWord = splited[splited.length - 1];

//         return lastWord.length();
        /*Solution 2: binary search*/
        int len = 0;
        int flag = 0;
        int strlength = s.length() - 1;
        // System.out.println(strlength);
        for(int i = strlength; i >= 0; i--){
            if(s.charAt(i) == ' ' && flag == 0){
                continue;
            }
            else if (s.charAt(i) != ' '){
                flag = 1;
                len ++;
            }
            else{
                break;
            }
        }
        return len;
    }
}