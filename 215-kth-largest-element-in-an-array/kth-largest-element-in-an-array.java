class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Heap(priority queue)
        int n= nums.length;
        Arrays.sort(nums);
        int count=0;
        for(int i =n-1; i>=0; i--){
             count++;
             if(count==k) return nums[i];

        }

        return -1;
    }
}