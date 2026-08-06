class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int[] invocation:invocations){
            int u=invocation[0],v=invocation[1];
            graph.get(u).add(v);
        }
        boolean[] vis=new boolean[n];
        dfs(k,graph,vis);
        boolean canRem=true;
        for(int[] invocation:invocations){
            int u=invocation[0],v=invocation[1];
            if(!vis[u]&&vis[v]){
                canRem=false;
                break;
            }
        }
        if(canRem){
            for(int i=0;i<n;i++){
                if(!vis[i]) ans.add(i);
            }
        }else{
            for(int i=0;i<n;i++) ans.add(i);
        }
        return ans;
    }

    void dfs(int node,List<List<Integer>> graph,boolean[] vis){
        vis[node]=true;
        for(int neighbor:graph.get(node)){
            if(!vis[neighbor]) dfs(neighbor,graph,vis);
        }
    }
}