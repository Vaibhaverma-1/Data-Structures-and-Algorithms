class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        int count=0;
        int[] hashset = new int[901];

        for(int i=0; i<n ;i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    int num= ((digits[i]*100) +(digits[j]*10)+ (digits[k]));
                    
                    if((i!=j && j!=k && k!=i) &&(100<= num && num <=999) && (num%2==0) && (hashset[num-99]==0)){
                       count++;
                       hashset[num-99]++;
                    }
                }
            }
        }
        return count;
    }
}
