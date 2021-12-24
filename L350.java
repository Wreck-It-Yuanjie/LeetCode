package Leetcode;

import java.util.*;

public class L350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];

        //two pointers
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 = 0, p2 = 0, k = 0;
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] < nums2[p2]) p1++;
            else if(nums1[p1] > nums2[p2]) p2++;
            else{
                answer[k++] = nums1[p1++];
                p2++;
            }
        }
        return Arrays.copyOf(answer, k);
    }
}
