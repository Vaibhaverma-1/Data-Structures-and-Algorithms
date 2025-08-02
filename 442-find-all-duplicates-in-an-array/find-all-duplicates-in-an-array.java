class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      int n = nums.length;
        int i=0;
        ArrayList<Integer> list = new ArrayList<>();
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
            list.add(nums[j-1]);
           }
        }
        return list;
        
    }

    void swap(int[] arr, int i, int j){
        int t= arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}