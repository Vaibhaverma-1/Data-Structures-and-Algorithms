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
class Solution{
    public TreeNode constructMaximumBinaryTree(int[] nums){
        return build(nums,0,nums.length-1);
    }

    TreeNode build(int[] nums,int ls,int lend){
        if(ls>lend) return null;
        int max=Integer.MIN_VALUE;
        int maxInd=-1;
        for(int i=ls;i<=lend;i++){
            if(nums[i]>max){
                max=nums[i];
                maxInd=i;
            }
        }
        TreeNode root=new TreeNode(max);
        root.left=build(nums,ls,maxInd-1);
        root.right=build(nums,maxInd+1,lend);
        return root;
    }
}
