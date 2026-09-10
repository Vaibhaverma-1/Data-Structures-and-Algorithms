class Solution {
    public int totalFruit(int[] fruits) {
        int i=0,j=0,n=fruits.length, variety=0, maxlen = Integer.MIN_VALUE;
        int[] freq = new int[n+1];
        while(j<n){
            if(freq[fruits[j]]==0){
                variety++;
            }
            freq[fruits[j]]++;
            while(variety>2){
                freq[fruits[i]]--;
                if(freq[fruits[i]]==0){
                    variety--;
                }
                i++;
            }
            if(variety<=2){
                maxlen = Math.max(maxlen,j-i+1);
            }
            j++;

        }
        return maxlen;
    }
}