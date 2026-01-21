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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pPath = new ArrayList<>();
        List<TreeNode> qPath = new ArrayList<>();

        findPath(root, p, pPath);
        findPath(root, q, qPath);

        int i = 0;
        while (i < pPath.size() && i < qPath.size() && pPath.get(i) == qPath.get(i)) {
            i++;
        }
        return pPath.get(i - 1);
    }

    private boolean findPath(TreeNode node, TreeNode target, List<TreeNode> path) {
        if (node == null) return false;

        path.add(node);
        if (node == target) return true;

        if (findPath(node.left, target, path) || findPath(node.right, target, path)) return true;

        path.remove(path.size() - 1);
        return false;
    }
}
