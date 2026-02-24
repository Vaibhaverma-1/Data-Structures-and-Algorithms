class Solution {
    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    public void dfs(TreeNode root, int current) {
        if (root == null) return;

        current = current * 2 + root.val;

        if (root.left == null && root.right == null) {
            sum += current;
            return;
        }

        dfs(root.left, current);
        dfs(root.right, current);
    }
}