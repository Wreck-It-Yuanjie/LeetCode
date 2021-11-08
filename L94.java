package Leetcode;

import java.util.*;

public class L94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inTra(root, result);
        return result;
    }
    public void inTra(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        inTra(root.left, result);
        result.add(root.val);
        inTra(root.right, result);
    }
}
