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
    TreeNode ans = null;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int maxDepth = getMaxDepth(root);       // Step 1: find max depth
        dfs(root, 1, maxDepth);                 // Step 2: postorder DFS
        return ans;                             // Step 3: return the answer
    }

    private int getMaxDepth(TreeNode root) {
        if (root == null) return 0; 
        return Math.max(getMaxDepth(root.left), getMaxDepth(root.right)) + 1;
    }

    private int dfs(TreeNode root, int depth, int maxDepth) {
        if (root == null) return depth - 1;

        int left = dfs(root.left, depth + 1, maxDepth);
        int right = dfs(root.right, depth + 1, maxDepth);

        if (left == maxDepth && right == maxDepth) ans = root;

        return Math.max(left, right);
    }
}
