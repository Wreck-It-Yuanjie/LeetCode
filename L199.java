package Leetcode;

import java.util.*;

public class L199 {
    // DFS
    public List<Integer> rightSideView(TreeNode root) {

        int level = 1;
        List<Integer> result = new ArrayList<>();

        DFS(root, level, result);

        return result;
    }

    // Pre-order DFS : return the first element of each level
    private void DFS(TreeNode root, int level, List<Integer> result){

        // if level ++, add to the result
        if(root != null){

            if(result.size() < level)
                result.add(root.val);

            // Preorder traversal
            DFS(root.right, level + 1, result);
            DFS(root.left, level + 1, result);
        }
    }
}
