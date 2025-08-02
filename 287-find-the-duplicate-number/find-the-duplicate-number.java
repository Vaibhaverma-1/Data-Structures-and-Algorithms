class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i=0;
          while (i < n) {
            int correct = nums[i] - 1;                    
            if (nums[i] < 1 || nums[i] > n) {            
                i++;
            } else if (nums[i] != nums[correct]) {  
                   
                swap(nums, i, correct);
            } else {
                
                i++;     
                                               
            }
        }

        for(int j=1; j<=n; j++){
           if(nums[j-1] != j){
            return nums[j-1];
           }
        }
        return -1;
        
    }

    void swap(int[] arr, int i, int j){
        int t= arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}

// // Tortoise and Hare Method
// class Solution {
//     public int findDuplicate(int[] nums) {
//         int slow = nums[0];
//         int fast = nums[0];
//         slow=nums[slow];
//         fast=nums[nums[fast]];
//         while(slow!=fast){
//             slow=nums[slow];
//             fast=nums[nums[fast]];
//         }
//         slow=nums[0];
//         while(slow!=fast){
//             slow=nums[slow];
//             fast=nums[fast];
//         }
//         return slow;
//     }
// }