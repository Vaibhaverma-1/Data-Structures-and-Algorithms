class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
         int n = nums.size();
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            if((nums.get(i)&1)==0){
                ans[i]=-1;
            }
            else{
                int num = nums.get(i);
                int count=0;
                while((num&1)==1){
                    count++;
                    num>>=1;
                }
                ans[i]=nums.get(i)&~(1<<(count-1));
            }
        }
        return ans;
    }
}