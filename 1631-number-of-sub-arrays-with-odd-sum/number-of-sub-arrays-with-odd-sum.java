class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int MOD = 1000000007;
        int odd=0,even=1;
        int sum=0;
        int count=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(sum%2==0 )
            { 
                count=(count+odd)%MOD;
                even++;
            }
            else
            {
                count=(count+even)%MOD;
                odd++;
            }

        }
        return count;
    }
}