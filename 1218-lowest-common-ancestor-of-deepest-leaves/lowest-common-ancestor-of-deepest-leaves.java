class Solution {
    TreeNode ans = null; // To store the final answer (LCA of deepest leaves)

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        // Step 1: Compute the maximum depth of the tree
        int maxDepth = getMaxDepth(root);
        
        // Step 2: Do a postorder DFS to find the LCA of all deepest leaves
        dfs(root, 1, maxDepth);  // start with depth = 1 at root
        return ans; // Return the LCA found
    }

    // Helper function to compute the maximum depth of the tree
    private int getMaxDepth(TreeNode root) {
        if (root == null) return 0; // Base case: empty node contributes 0 depth
        // Depth = 1 + maximum of left and right subtree depths
        return Math.max(getMaxDepth(root.left), getMaxDepth(root.right)) + 1;
    }

    // Postorder DFS: returns the deepest depth reached in the current subtree
    private int dfs(TreeNode root, int depth, int maxDepth) {
        if (root == null) return depth - 1; // Null node contributes nothing to depth

        // Recur on left and right subtrees
        int left = dfs(root.left, depth + 1, maxDepth);
        int right = dfs(root.right, depth + 1, maxDepth);

        // If both left and right subtrees reach the maximum depth,
        // this node is the lowest common ancestor (LCA) of deepest leaves
        if (left == maxDepth && right == maxDepth) ans = root;

        // Return the maximum depth found in this subtree
        return Math.max(left, right);
    }
}
