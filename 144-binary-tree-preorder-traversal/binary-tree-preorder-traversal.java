class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        // CORRECTION: moved list inside the function to avoid using a global list.
        // Global lists persist across multiple calls and make the process slow.
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    void preorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}
