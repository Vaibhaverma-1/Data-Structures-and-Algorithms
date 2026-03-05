class Solution {
    public int minOperations(String s) {
        return Math.min(calc(s,0,0),calc(s,0,1));
    }
    int calc(String s, int i, int or){
        int count=0;
        if(i==s.length()){
            return count;
        }
        if((or==1&&s.charAt(i)=='0')||(or==0 && s.charAt(i)=='1')){
            count+=1;
        
        }
        or = or==0?1:0;
        return count+calc(s,i+1,or);
        
        
    }
    
    //oeoe..
    //eoeo..
}