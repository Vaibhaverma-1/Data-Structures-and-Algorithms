class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1= new int[n];
        int[] arr2= new int[n];
        arr1[0]=nums[0];
        int l1=0,l2=0;
        arr2[0]=nums[1];
        for(int i=2; i<n; i++){
            if(arr1[l1]>arr2[l2]){
                l1++;
                arr1[l1]=nums[i];
            }
            else{
                l2++;
                arr2[l2]=nums[i];
            }
        }
        l2=0;
        for(int i=0; i<n; i++){
           if(arr1[i]!=0){
            nums[i]=arr1[i];
           }
           else{
            nums[i]=arr2[l2];
            l2++;
           }
        }
        return nums;
    }
}