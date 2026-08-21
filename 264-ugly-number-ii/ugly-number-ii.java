class Solution {
    public int nthUglyNumber(int n) {
        long ans=0L;
        HashSet<Long> set = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.add(1L);
        set.add(1L);
        while(n>0){
            long curr =pq.poll();
            ans=curr;
            n--;
            if(!set.contains(curr*2)){
               pq.add(curr*2);
               set.add(curr*2);
            }
            if(!set.contains(curr*3)){
               pq.add(curr*3);
               set.add(curr*3);
            }
            if(!set.contains(curr*5)){
               pq.add(curr*5);
               set.add(curr*5);
            }


        }
        return (int)ans;
        
    }
}