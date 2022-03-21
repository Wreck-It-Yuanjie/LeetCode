package Leetcode;

import java.util.*;

class L412 {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        // solution 1: iteration
        // for(int i = 1; i <= n; i++){
        //     if(i%3 == 0 && i%5 == 0){
        //         answer.add("FizzBuzz");
        //     }
        //     else if(i%3 == 0){
        //         answer.add("Fizz");
        //     }
        //     else if(i%5 == 0){
        //         answer.add("Buzz");
        //     }
        //     else{
        //         answer.add(Integer.toString(i));
        //     }
        // }
        // return answer;

        // solution 2: string concatenation
        // for(int i = 1; i <= n; i++){
        //     String tempAns = "";
        //     if(i%3 == 0){
        //         tempAns += "Fizz";
        //     }
        //     if(i%5 == 0){
        //         tempAns += "Buzz";
        //     }
        //     if(i%3 != 0 && i%5 != 0){
        //         tempAns = Integer.toString(i);
        //     }
        //     answer.add(tempAns);
        // }
        // return answer;

        // solution 3: hashtable
        Map<Integer, String> hashmap = new HashMap<>(){
            {
                put(3, "Fizz");
                put(5, "Buzz");
            }
        };

        for(int i = 1; i <= n; i++){
            String tempAns = "";

            for(Integer key : hashmap.keySet()){
                if(i%key == 0){
                    tempAns += hashmap.get(key);
                }
            }
            if(tempAns.equals("")){
                tempAns = Integer.toString(i);
            }
            answer.add(tempAns);
        }
        return answer;
    }
}

// time complexity: n
// space complexity: n
