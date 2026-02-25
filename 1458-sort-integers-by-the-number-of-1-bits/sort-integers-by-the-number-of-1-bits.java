class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int maxBits=0;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int[] ans=new int[n];
        for(int i=0;i<n; i++){
            int temp = arr[i];
            int count=0;
            while(temp!=0){
                temp = temp&(temp-1);
                count++;
            }
            if(count>maxBits){
                maxBits=count;
            }
            if(!map.containsKey(count)){
                map.put(count, new ArrayList<>());

               
            }
            map.get(count).add(arr[i]);

        }
        int ind=0;
        for(int i=0; i<maxBits+1; i++){
            if(map.containsKey(i)){
                for(int val: map.get(i)){
                    ans[ind]=val;
                    ind++;
                }
            }
        }
       
        return ans;
        
    }
}