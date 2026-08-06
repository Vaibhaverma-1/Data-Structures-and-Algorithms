class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; i<=100; i++){
            int mul =countDig(i);
            if(mul%t==0){
                return i;
            }
        }
        return -1;
        
    }

    public int countDig(int n){
        if (n>=0 && n<=9) return n;
        int num=1;
        while(n!=0){
          if(n%10==0) return 0;
          num = num* (n %10);
          n=n/10;
        }
        return num;
        
    }
}