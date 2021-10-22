package Leetcode;

import java.util.*;

public class L496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        /*brutal force*/
        // for(int i = 0; i < nums1.length; i++){
        //     for(int j = 0; j < nums2.length; j++){
        //         if(nums1[i] == nums2[j]){
        //             int flag = 1;
        //             while(j+flag < nums2.length){
        //                 if(nums2[j+flag] > nums2[j]){
        //                     result[i] = nums2[j+flag];
        //                     break;
        //                 }
        //                 else{
        //                     flag ++;
        //                 }
        //             }
        //             if(result[i] == 0){
        //                 result[i] = -1;
        //             }
        //         }
        //     }
        // }
        // return result;
        /*hash map*/
//         HashMap<Integer, Integer> hash = new HashMap<>();
//         for(int i = 0; i < nums2.length; i++){
//             hash.put(nums2[i], i);
//         }

//         for(int i = 0; i < nums1.length; i++){
//             int index = hash.get(nums1[i]);
//             // System.out.println(nums2[index]);
//             if(nums1[i] == nums2[index]){
//                 int flag = 1;
//                 while(index+flag < nums2.length){
//                     if(nums2[index+flag] > nums2[index]){
//                         result[i] = nums2[index+flag];
//                         break;
//                     }
//                      else{
//                         flag ++;
//                     }
//                 }
//             }
//             if(result[i] == 0){
//                 result[i] = -1;
//             }
//         }
//         return result;
        /*hashmap + stack*/
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.empty() && nums2[i] > stack.peek())
                map.put(stack.pop(), nums2[i]);
            stack.push(nums2[i]);
        }

        while (!stack.empty())
            map.put(stack.pop(), -1);

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
