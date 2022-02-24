package Leetcode;

import java.util.*;

class L103 {

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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = 0;
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(root != null){
            helper(result, root, level);
        }
        return result;
    }

    private void helper(List<List<Integer>> result, TreeNode root, int level){

        if(root != null){
            if(result.size() - 1 < level){
                List<Integer> temp = new ArrayList<>();
                temp.add(root.val);
                result.add(temp);
            }
            // even : left --> right
            else if(level%2 != 0){
                result.get(level).add(root.val);
            }
            // odd : right --> left
            else{
                result.get(level).add(0, root.val);
            }

            helper(result, root.right, level + 1);
            helper(result, root.left, level + 1);
        }

    }
}
