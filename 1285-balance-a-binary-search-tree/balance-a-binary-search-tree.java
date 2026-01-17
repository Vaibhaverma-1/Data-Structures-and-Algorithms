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

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return build(list, 0, list.size() - 1);
    }

    // Inorder traversal to get sorted values
    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    // Build balanced BST from sorted list
    private TreeNode build(List<Integer> list, int l, int r) {
        if (l > r) return null;

        int mid = (l + r) / 2;
        TreeNode node = new TreeNode(list.get(mid));

        node.left = build(list, l, mid - 1);
        node.right = build(list, mid + 1, r);

        return node;
    }
}
