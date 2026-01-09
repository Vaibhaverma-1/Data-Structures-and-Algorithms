class Solution {
    public int countOdds(int low, int high) {
        int n = (high-low+1);
        int count=0;
        if(n%2 ==0) count = n/2;
        else{
            if(low%2 !=0 || high%2 !=0){
                count = (n/2)+1;
            }
            else{
                count = n/2;
            }
        }
        return count;
    }
}