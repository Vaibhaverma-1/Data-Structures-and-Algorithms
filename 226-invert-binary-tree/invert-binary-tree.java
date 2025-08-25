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
    public TreeNode invertTree(TreeNode root) {
        if(root== null) return root;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left!=null && node.right!=null){
              TreeNode sample= node.left;
              node.left= node.right;
              node.right=sample;
              q.offer(node.left);
              q.offer(node.right);
            } 
            else if(node.right!=null){
                 node.left = node.right;
                 node.right=null;
                 q.offer(node.left);
                
            }
            else if (node.left!=null){
                node.right =node.left;
                node.left = null;
                q.offer(node.right);
            }
        }
        return root;
        
    }
}