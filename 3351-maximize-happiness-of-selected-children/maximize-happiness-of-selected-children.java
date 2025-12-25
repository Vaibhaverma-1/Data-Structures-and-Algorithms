class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        long sum=0;
        int i =n-1;
        int counter=0;
        while(k>0 && i>=0){
           if((long)happiness[i]-counter>=0){ sum+=(long)(happiness[i]-counter);}
            i--;
            counter++;
            k--;
        }
        return sum;
    }
}