package Leetcode;

import java.util.*;

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
class L545 {
    // pre-order traversal
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        List<Integer> leftBoundary = new ArrayList<>();
        List<Integer> rightBoundary = new ArrayList<>();
        List<Integer> leaves = new ArrayList<>();

        // flag :  type of root
        // 0 : root
        // 1 : left bound
        // 2 : right bound
        // 3 : leaves
        // 4 : others
        int flag = 0;

        DFS(root, result, leftBoundary, rightBoundary, leaves, flag);

        result.addAll(leftBoundary);
        result.addAll(leaves);
        result.addAll(rightBoundary);

        return result;
    }

    private void DFS(TreeNode root, List<Integer> result, List<Integer> leftBoundary, List<Integer> rightBoundary, List<Integer> leaves, int flag){
        if(root != null){
            // if real root
            if(flag == 0){
                result.add(root.val);
            }
            else{
                // leaves
                if(flag == 3){
                    leaves.add(root.val);
                }
                // left boundaries
                else if(flag == 1){
                    leftBoundary.add(root.val);
                }
                // right boundaries
                else if(flag == 2){
                    rightBoundary.add(0,root.val);
                }
            }
            // recursion
            DFS(root.left, result, leftBoundary, rightBoundary, leaves, FlagHelper(root, root.left, flag));
            DFS(root.right, result, leftBoundary, rightBoundary, leaves, FlagHelper(root, root.right, flag));
        }
    }

    private int FlagHelper(TreeNode root, TreeNode child, int flag){
        // leave node
        if(child != null){
            if(child.left == null && child.right == null){
                return 3;
            }
            // left bound : (1) if current flag == 1 and the child is the left node
            // (2) if current flag == 1 and the child is the right node and there is no left child
            else if(((flag == 1 || flag == 0) && child == root.left) || ((flag == 1) && child == root.right && root.left == null)){
                flag = 1;
            }
            // right bound : if current flag == 2 and the child is the right node
            else if(((flag == 2 || flag == 0) && child == root.right) || ((flag == 2) && child == root.left && root.right == null)){
                flag = 2;
            }
            // others : flag = 4
            else{
                flag = 4;
            }
        }
        return flag;
    }
}
