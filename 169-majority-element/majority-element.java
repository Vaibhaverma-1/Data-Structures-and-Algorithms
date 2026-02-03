class Solution {
    public int majorityElement(int[] arr) {
        int count=0, candidate=arr[0];
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(count==0){
                candidate=arr[i];
            }
            if(candidate==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}