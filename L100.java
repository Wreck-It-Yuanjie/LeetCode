package Leetcode;

public class L100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /*recursion*/
        boolean result = false;
        result = sametree(p, q);
        return result;
    }

    public boolean sametree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return sametree(p.left, q.left) && sametree(p.right, q.right);
    }
}
