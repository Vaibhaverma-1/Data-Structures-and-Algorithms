class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        if(start>=n || start<0 || arr[start]==-1) return false;
        if(arr[start]==0) return true;
        int jump = arr[start];
        arr[start]=-1;
        return canReach(arr, start+jump)|| canReach(arr, start-jump);
    }
}