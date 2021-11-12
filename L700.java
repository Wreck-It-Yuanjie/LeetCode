package Leetcode;

public class L700 {
     public class TreeNode {
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

    public TreeNode searchBST(TreeNode root, int val) {
//         //Recursion
//         /*base case*/
//         if(root == null || root.val == val) return root;

//         /*recursion*/
//         if (root.val > val){
//             return searchBST(root.left, val);
//         }
//         else{
//             return searchBST(root.right, val);
//         }
        //Iteration
        while(root != null && root.val != val){
            if(root.val > val) root = root.left;
            else root = root.right;
        }
        return root;
    }
}
