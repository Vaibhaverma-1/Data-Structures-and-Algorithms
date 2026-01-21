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
    String ans = null;

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        return ans;
    }

    private void dfs(TreeNode node, String path) {
        if (node == null) return;

        path += (char)('a' + node.val);

        if (node.left == null && node.right == null) {
            String s = new StringBuilder(path).reverse().toString();
            if (ans == null || s.compareTo(ans) < 0) ans = s;
            return;
        }

        dfs(node.left, path);
        dfs(node.right, path);
    }
}
