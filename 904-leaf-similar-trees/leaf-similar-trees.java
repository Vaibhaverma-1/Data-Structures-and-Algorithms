class Solution {
    ArrayList<Integer> list1,list2;
    public boolean leafSimilar(TreeNode root1,TreeNode root2) {
        list1=new ArrayList<>();
        list2=new ArrayList<>();
        dfs(root1,list1);
        dfs(root2,list2);
        return list1.equals(list2);
    }
    void dfs(TreeNode root,ArrayList<Integer> list){
        if(root==null) return;
        if(root.left==null && root.right==null) list.add(root.val);
        dfs(root.left,list);
        dfs(root.right,list);
    }
}