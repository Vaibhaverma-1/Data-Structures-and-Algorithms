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
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return func(root);
    }

    public int func(TreeNode root){
        if(root == null) return 0;
        int sum=0;
        TreeNode temp = root.left;
        if(temp != null && temp.right == null && temp.left == null) sum+=temp.val;

        return sum+func(root.left)+func(root.right);
    }
}