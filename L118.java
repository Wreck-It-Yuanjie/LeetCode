package Leetcode;

import java.util.*;

public class L118 {
    //     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> result = new ArrayList<List<Integer>>();
//         /*Iteration*/
//         if(numRows == 0) return result;

//         for(int i = 0; i < numRows; i++){
//             if(i == 0){
//                 List<Integer> temp = new ArrayList<>();
//                 temp.add(1);
//                 result.add(temp);
//             }
//             else{
//                 List<Integer> temp = new ArrayList<>();
//                 temp.add(1);
//                 List<Integer> prevList = result.get(i-1);
//                 for(int j = 1; j < i; j++){
//                     temp.add(prevList.get(j-1) + prevList.get(j));
//                 }
//                 temp.add(1);
//                 result.add(temp);
//             }

    //         }
//         return result;
//     }
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> generate(int numRows) {

        /*recursion*/
        if(numRows == 0) return result;

        generate(numRows - 1);

        if(numRows == 1){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            result.add(temp);
        }
        else{
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            List<Integer> prevList = result.get(numRows - 1 - 1);
            for(int j = 1; j < numRows - 1; j++){
                temp.add(prevList.get(j-1) + prevList.get(j));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}
