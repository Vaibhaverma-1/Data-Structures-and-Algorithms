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
    int count=0;
    int ans=0;
    int val=0;
    public int kthSmallest(TreeNode root, int k) {
        val=k;
        inorder(root);
        return ans;

    }
    void inorder(TreeNode root){
    if(root==null) return;
    inorder(root.left);
    count++;
    if(val==count) ans = root.val;
    inorder(root.right);
}

}