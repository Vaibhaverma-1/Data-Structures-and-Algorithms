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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) return list;

        q.offer(root);

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode save = q.poll();
                ans.add(save.val);

                if (save.left != null) q.offer(save.left);
                if (save.right != null) q.offer(save.right);
            }

            list.add(ans);
        }

        return list;
    }
}
