package Leetcode;

public class L112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        /*recursion*/
        if(root == null) return false;

        /*bottom up recursion*/
        targetSum = targetSum - root.val;
        if(root.left == null && root.right == null){
            return (targetSum == 0);
        }
        else{
            return (hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum));
        }
    }
}
