class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;
        char max ='a',min='z';
        int maxCount=0,minCount=0;
        for(int i=0; i<n; i++){
            if(i<n-1 && s.charAt(i)>s.charAt(i+1)) sorted =false;
            if(s.charAt(i)>max){
                max=s.charAt(i);
                maxCount=1;
            }
            else if(max==s.charAt(i)) maxCount++;
            if(s.charAt(i)<min){
                min=s.charAt(i);
                minCount=1;
            }
            else if(min==s.charAt(i)) minCount++;
        }

        if(sorted) return 0;
        // cant take entire string as substring
        if(n==2) return -1;
        //n>=3
        char start = s.charAt(0),end= s.charAt(n-1);
        if(start==min||end==max) return 1;
        if(start==max && end==min && minCount==1 && maxCount==1 ) return 3;
        return 2;
    }
}