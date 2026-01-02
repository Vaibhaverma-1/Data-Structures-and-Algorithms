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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length ==0) return null;
        if(nums.length ==1) return new TreeNode(nums[0],  null, null);
        int n = nums.length;
        int mid = n/2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = finder(nums, 0, mid-1);
        head.right =  finder(nums, mid+1,  n-1);
        return head;
       
        
        
    }
    public TreeNode finder(int[] nums, int start, int end){
        if(start == end ){
            return new TreeNode(nums[start], null, null);
    
        }
        if(start > end ) return null;
        
        int mid = (end+start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = finder(nums,start,mid-1);
        node.right= finder(nums,mid+1, end);
        return node;
    }
}