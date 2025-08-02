// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length, ans = n;
//         for (int i = 0; i < n; i++) ans ^= i ^ nums[i];
//         return ans;
//     }
// }
class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int i=0;
        while(i<n){
            int correct = nums[i];
            if(nums[i] == n) i++; 
            else  if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for(int j=0; j<n;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return n;
    }

    void swap(int[] arr, int i, int j){
        int t= arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}