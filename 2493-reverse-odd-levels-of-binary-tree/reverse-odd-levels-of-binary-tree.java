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
import java.util.*;

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) return root;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            List<TreeNode> currLevel = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                currLevel.add(node);

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

          
            if (level % 2 == 1) {
                int i = 0, j = currLevel.size() - 1;
                while (i < j) {
                    int temp = currLevel.get(i).val;
                    currLevel.get(i).val = currLevel.get(j).val;
                    currLevel.get(j).val = temp;
                    i++;
                    j--;
                }
            }

            level++;
        }

        return root;
    }
}
