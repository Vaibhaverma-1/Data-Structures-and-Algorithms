class Solution {
    boolean balanced = true;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return balanced;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        if (Math.abs(left - right) > 1) {
            balanced = false;
        }

        return 1 + Math.max(left, right);
    }
}
