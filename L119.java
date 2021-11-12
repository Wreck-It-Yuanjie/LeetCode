package Leetcode;

import java.util.*;

public class L119 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> getRow(int rowIndex) {
        /*Recursion*/
        if(rowIndex == 0){
            result.add(1);
            return result;
        }

        //recursion
        getRow(rowIndex - 1);

        //pass result to prevNode
        List<Integer> prevNode = new ArrayList<>();

        for(int i = 0; i < result.size(); i++) prevNode.add(result.get(i));

        //base case
        result.clear();
        result.add(1);

        for(int i = 1; i < rowIndex; i++){
            result.add(prevNode.get(i-1) + prevNode.get(i));
        }
        result.add(1);

        return result;
    }
}
