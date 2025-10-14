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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode dummy = root;
        List<Integer> ans = new ArrayList<>();
        solve(dummy,ans);
        return ans;
    }
    public void solve(TreeNode node, List<Integer> ans){
        if(node==null) return;
        solve(node.left,ans);
        ans.add(node.val);
        solve(node.right,ans);
    
    
    }
}