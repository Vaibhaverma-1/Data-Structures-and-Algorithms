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
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(cloned);
        TreeNode copy = new TreeNode(0);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.val == target.val){
                  
                  copy.left=temp;
                  break;
            }
            if(temp.left !=null) queue.offer(temp.left);
            if(temp.right !=null) queue.offer(temp.right);
        }

        return copy.left;
    }
}