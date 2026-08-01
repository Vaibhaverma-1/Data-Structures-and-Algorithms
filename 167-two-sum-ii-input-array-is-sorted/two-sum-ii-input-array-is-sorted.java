class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j = numbers.length-1;
        int[] ans = new int[2];
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }

            
        }
        return ans;
    }
}
// [-1,0,1,2,3] targte =-1; -1+3=2