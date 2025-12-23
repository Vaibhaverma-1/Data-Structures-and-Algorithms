class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        int i=0;
        while(i<n){
            int ind = nums[i]-1;
            if(nums[i] != nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
            }
            else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int j=0; j<n; j++){
            if(nums[j]!=j+1)list.add(j+1);
        }
        return list;
    }
}