class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        
        int i = 0;
        while (i < n) {
            int start = nums[i];
            
           
            while (i + 1 < n && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            
            int end = nums[i];
            
            if (start == end) {
                list.add(String.valueOf(start));
            } else {
                list.add(start + "->" + end);
            }
            
            i++; 
        }
        
        return list;
    }
}
