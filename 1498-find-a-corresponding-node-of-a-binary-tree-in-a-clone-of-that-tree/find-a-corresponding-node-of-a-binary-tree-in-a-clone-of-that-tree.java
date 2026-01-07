/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(cloned);
        
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.val == target.val) return node; 
            if(node.left != null) q.offer(node.left);
            if(node.right != null) q.offer(node.right);
        }
        return null; 
    }
}
