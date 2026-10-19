class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        int lesser=0,equalTarget=0;
        for(int num:nums){
            if(num<target) lesser++;
            else if(num==target) equalTarget++;
        }

        if(equalTarget==0) return list;
        for(int i=lesser; i<lesser+equalTarget; i++){
            list.add(i);
        }
        return list;


    }
}