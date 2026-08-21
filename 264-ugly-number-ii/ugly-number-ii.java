class Solution {
    public int nthUglyNumber(int n) {
        long[] arr = new long[n];
        arr[0]=1;
        int p2=0;
        int p3=0;
        int p5=0;
        for(int i=1; i<n; i++){
            long next2= arr[p2]*2;
            long next3= arr[p3]*3;
            long next5= arr[p5]*5;
            arr[i] = Math.min(next2, Math.min(next3,next5));
            if(arr[i]==next2) p2++;
            if(arr[i]==next3) p3++;
            if(arr[i]==next5) p5++;
        }
        return (int) arr[n-1];
    }
}
// class Solution {
//     public int nthUglyNumber(int n) {
//         long ans=0L;
//         HashSet<Long> set = new HashSet<>();
//         PriorityQueue<Long> pq = new PriorityQueue<>();
//         pq.add(1L);
//         set.add(1L);
//         while(n>0){
//             long curr =pq.poll();
//             ans=curr;
//             n--;
//             if(!set.contains(curr*2)){
//                pq.add(curr*2);
//                set.add(curr*2);
//             }
//             if(!set.contains(curr*3)){
//                pq.add(curr*3);
//                set.add(curr*3);
//             }
//             if(!set.contains(curr*5)){
//                pq.add(curr*5);
//                set.add(curr*5);
//             }


//         }
//         return (int)ans;
        
//     }
// }