class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList <Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int num = nums[i];
            int digits = (num==0)?1:(int)Math.log10(num)+1;
            int div = (int) Math.pow(10,digits-1);
            while(div!=0){
                list.add(num/div);
                num = num%div;
                div= div/10;
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
         arr[i] = list.get(i);
         }

return arr;
    }
}