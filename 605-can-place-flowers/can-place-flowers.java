class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(n==0) return true;

        for(int i=0; i<len; i++){
            if(flowerbed[i]==0){
                int left = (i==0) ? 0 : flowerbed[i-1];
                int right = (i==len-1) ? 0 : flowerbed[i+1];

                if(left==0 && right==0){
                    flowerbed[i]=1;
                    n--;
                    if(n==0) return true;
                }
            }
        }

        return false;
    }
}