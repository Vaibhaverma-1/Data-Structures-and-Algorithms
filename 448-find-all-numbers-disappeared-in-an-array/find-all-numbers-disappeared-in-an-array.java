class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;

        while (i < n) {
            int correct = nums[i] - 1;                    
            if (nums[i] < 1 || nums[i] > n) {             // out of range -> skip
                i++;
            } else if (nums[i] != nums[correct]) {       
                swap(nums, i, correct);
            } else {
                i++;                                     
            }
        }

        for (int j = 1; j <= n; j++) {                    
            if (nums[j - 1] != j) {
                list.add(j);
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