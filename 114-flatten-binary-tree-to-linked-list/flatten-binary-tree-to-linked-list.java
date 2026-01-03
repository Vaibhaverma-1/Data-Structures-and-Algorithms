class Solution {
    public void flatten(TreeNode root) {
        func(root);
    }

    void func(TreeNode root) {
        if (root == null) return;

        func(root.left);
        func(root.right);

        if (root.left == null) return;

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;

        TreeNode cur = root.right;
        while (cur.right != null) {
            cur = cur.right;
        }
        cur.right = temp;
    }
}
