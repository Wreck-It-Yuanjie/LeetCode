package Leetcode;

import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
 }
}

public class L144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        preTra(root, result);
        return result;
    }
    void preTra(TreeNode root, List<Integer> result){
        //Base case
        if(root == null){
            return;
        }
        result.add(root.val);
        //recursion
        preTra(root.left, result);
        preTra(root.right, result);
    }
}
