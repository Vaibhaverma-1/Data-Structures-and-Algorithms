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
class Solution{
    public int deepestLeavesSum(TreeNode root){
        int depth=maxDepth(root);
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int level=1,sum=0;
        while(!q.isEmpty()){
            int n=q.size();
            if(level==depth) sum=0;
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                if(level==depth) sum+=node.val;
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            level++;
        }
        return sum;
    }
    int maxDepth(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
