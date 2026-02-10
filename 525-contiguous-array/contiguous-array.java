class Solution {
    public int findMaxLength(int[] nums) {
    int n = nums.length;
    for(int i=0; i<n; i++){
        if(nums[i]==0){
            nums[i]=-1;
        }
    }
    HashMap<Integer,Integer> map = new HashMap<>();
    int preDiff;
    int max=0;
    preDiff=0;
    map.put(0,-1);
    for(int i=0; i<n; i++){
       preDiff=preDiff+nums[i];
       if(map.containsKey(preDiff)){
          int diff = i - map.get(preDiff);
          max= Math.max(max,diff);
        
       }
       else{
         map.put(preDiff, i);
         }


    }
    return max;
    }
}


