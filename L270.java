package Leetcode;

// root == null? No
// root.left = null and root.right = null? Yes
// dfs search
// root_prev = 4
// diff_prev = 0.29
// root = 2
// diff = 1.71 > diff_prev return root_value



class L270 {

    class TreeNode {
        int val;
        Leetcode.TreeNode left;
        Leetcode.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Leetcode.TreeNode left, Leetcode.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // dfs
    public int closestValue(TreeNode root, double target) {

        int val, closest = root.val;

        while(root != null){
            val = root.val;
            closest = Math.abs(val - target) < Math.abs(closest - target)? val : closest;
            root = target < root.val? root.left : root.right;
        }
        return closest;
    }
}