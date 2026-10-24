class Solution {
    int maxLen=0;
    public int longestZigZag(TreeNode root) {
        dfs(root,0,1);
        //dfs(root,0,-1);
        return maxLen;
    }
    void dfs(TreeNode root,int len,int dir){
        if(root==null) return;
        maxLen=Math.max(maxLen,len);
        if(dir==1){
            if(root.right!=null) dfs(root.right,len+1,-1);
            if(root.left!=null) dfs(root.left,1,1);
        }else{
            if(root.left!=null) dfs(root.left,len+1,1);
            if(root.right!=null) dfs(root.right,1,-1);
        }
    }
}