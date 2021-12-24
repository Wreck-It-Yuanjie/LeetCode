package Leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class L404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, false);
    }

    public int helper(TreeNode subtree, boolean isLeft){

        //Base case: this is an empty tree
        if(subtree == null) return 0;

        //Base case: this is a leaf node
        if(subtree.left == null && subtree.right == null){
            if(isLeft == true) return subtree.val;
            else return 0;
        }

        //recursive case: add results
        return helper(subtree.left, true) + helper(subtree.right, false);
    }
}
