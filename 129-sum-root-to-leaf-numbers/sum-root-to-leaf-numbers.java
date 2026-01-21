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
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, "");
        return sum;
    }

    private void dfs(TreeNode node, String path) {
        if (node == null) return;

        // add current node value to path
        path = path + node.val;

        // if leaf node, parse and add
        if (node.left == null && node.right == null) {
            sum += Integer.parseInt(path);
            return;
        }

        // dfs left and right
        dfs(node.left, path);
        dfs(node.right, path);
    }
}
