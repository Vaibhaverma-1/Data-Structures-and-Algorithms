class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0,len=ans.length; i<len; i++){
            ans[i]=helper(i);
        }
        return ans;
    }
    int helper(int i){
        int count=0;
        while(i!=0){
            i&=i-1;
            count++;
        }
        return count;
    }
}