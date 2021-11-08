package Leetcode;

public class L783 {
    //     public int minDiffInBST(TreeNode root) {
//         int minVal = Integer.MAX_VALUE;
//         List<Integer> travelsal = new ArrayList<>();
//         /*Preorder traversal*/
//         preorder(root, travelsal);
//         /*one pass*/
//         Collections.sort(travelsal);
//         for(int i = 1; i < travelsal.size(); i++){
//             if(travelsal.get(i) - travelsal.get(i - 1) < minVal){
//                 minVal = travelsal.get(i) - travelsal.get(i - 1);
//             }
//         }
//         return minVal;
//     }

//     public void preorder(TreeNode root, List<Integer> travelsal){
//         if(root == null) return;
//         travelsal.add(root.val);
//         preorder(root.left, travelsal);
//         preorder(root.right, travelsal);
//     }

    Integer prev = null;
    Integer result = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        /*Inorder traversal*/
        inorder(root);
        return result;
    }

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(prev != null){
            result = Math.min(result, root.val - prev);
        }
        prev = root.val;
        inorder(root.right);
    }
}
