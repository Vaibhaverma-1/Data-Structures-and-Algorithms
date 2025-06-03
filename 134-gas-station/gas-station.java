class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n= gas.length;
        int[] dif = new int[n];
        int gasSum=0, costSum=0;
        for(int i=0; i<n; i++){
            gasSum+=gas[i];
            costSum+=cost[i];
            dif[i] = gas[i]-cost[i];
        }
        if(gasSum<costSum){
            return -1;
        }
        int start=0, sum=0;
        for(int i=0; i<n; i++){
            sum+= dif[i];
            if(sum<0){
                sum=0;
                start=i+1;
            }
        }
        return start;
        
    }
}