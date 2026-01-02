class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }

    boolean dfs(TreeNode root, int remSum) {

        // CORRECTION 1: if node is null, no path exists
        if (root == null) return false;

        // CORRECTION 2: subtract current node value FIRST (preorder)
        remSum -= root.val;

        // CORRECTION 3: check leaf AFTER subtraction
        if (root.left == null && root.right == null) {
            return remSum == 0;
        }

        // CORRECTION 4: removed invalid remSum < 0 pruning
        return dfs(root.left, remSum) || dfs(root.right, remSum);
    }
}
