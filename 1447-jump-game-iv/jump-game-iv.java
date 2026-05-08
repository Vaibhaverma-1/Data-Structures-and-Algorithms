class Solution {
    HashMap<Integer,List<Integer>> map;
    boolean[] visited;
    int n;
    public int minJumps(int[] arr) {
        map=new HashMap<>();
        n=arr.length;
        visited=new boolean[n];
        for(int i=0;i<n;i++){
            int key=arr[i];
            if(map.containsKey(key)){
                map.get(key).add(i);
            }
            else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(key,list);
            }
        }
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        visited[0]=true;
        int jumps=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-- >0){
                int idx=q.poll();
                if(idx==n-1)
                    return jumps;
                if(idx<n-1 && !visited[idx+1]){
                    visited[idx+1]=true;
                    q.offer(idx+1);
                }
                if(idx>0 && !visited[idx-1]){
                    visited[idx-1]=true;
                    q.offer(idx-1);
                }
                if(map.containsKey(arr[idx])){
                    List<Integer> temp=map.get(arr[idx]);
                    for(int next:temp){
                        if(!visited[next]){
                            visited[next]=true;
                            q.offer(next);
                        }
                    }
                    map.remove(arr[idx]);
                }
            }
            jumps++;
        }
        return -1;
    }
}