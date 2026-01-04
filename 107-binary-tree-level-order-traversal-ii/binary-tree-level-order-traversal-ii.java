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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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


      int i = 0, j = list.size() - 1;
        while (i < j) {
            List<Integer> temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

        return list;   
    }
}