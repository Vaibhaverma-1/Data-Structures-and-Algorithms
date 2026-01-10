class Solution {
    public int addDigits(int num) {
      if(num>=0 && num<10) return num;
      while(num>=10){
      num=sumDig(num);
      }
      return num;
        
    }

    int sumDig(int num){
        int sum=0;
        while(num>0 ){
        sum += num%10;
        num = num/10;
        }
        return sum;
    }
}