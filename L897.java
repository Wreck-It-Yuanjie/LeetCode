package Leetcode;

import java.util.*;

public class L897 {
    public TreeNode increasingBST(TreeNode root) {
        //get inorder tree
        List<Integer> inorderTree = new ArrayList<>();
        inorder(inorderTree, root);

        //get the right tree
        TreeNode result = new TreeNode(inorderTree.get(0));
        TreeNode temp = result;
        for(int i = 1; i < inorderTree.size(); i++){
            // System.out.println(temp.val);
            temp.right = new TreeNode(inorderTree.get(i));
            temp = temp.right;
        }

        return result;
    }
    public void inorder(List<Integer> inorderTree, TreeNode root){
        if(root == null) return;

        inorder(inorderTree, root.left);
        inorderTree.add(root.val);
        inorder(inorderTree, root.right);
    }
}
