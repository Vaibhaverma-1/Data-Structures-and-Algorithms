class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int left=0;
        double sum=0;
        int count=0;
        for(int right=0; right<n; right++){
            sum+=(double)arr[right];
            while(right-left+1>k){
                sum-=(double)arr[left];
                left++;
            }
            if(right-left+1==k && sum/k>=threshold){
                count++;
            }

        }
        return count;
        
    }
}