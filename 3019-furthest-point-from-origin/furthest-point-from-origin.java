class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lCount=0, rCount=0, bCount=0, n = moves.length();
        for(int i=0; i<n; i++){
            if(moves.charAt(i)=='L'){
                lCount++;
            }
            else if(moves.charAt(i)=='R'){
                rCount++;
            }
            else{
                bCount++;
            }
        }
        
        return lCount>=rCount?lCount+bCount-rCount:rCount+bCount-lCount;
        
    }
}