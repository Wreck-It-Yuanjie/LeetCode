package Leetcode;

public class L250 {
    // recursion O(N2)
    public int countUnivalSubtrees(TreeNode root) {
        /*recursion*/
        int count = 0;

        //base case
        if(root == null) return 0;

        int countleft = countUnivalSubtrees(root.left);
        int countright = countUnivalSubtrees(root.right);

        count = countleft + countright;

        //if this tree is universal, count++
        if(helper(root)) count++;
        return count;
    }

    // tell if a tree is universal
    public boolean helper(TreeNode root){
        /*recursion*/
        if(root == null) return true;

        if(root.left != null && root.val != root.left.val) return false;
        if(root.right != null && root.val != root.right.val) return false;

        if(helper(root.left) && helper(root.right)) return true;
        else return false;
    }
}
