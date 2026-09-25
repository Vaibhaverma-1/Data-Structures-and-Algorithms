class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length(),m=t.length();
        int i=n-1,j=m-1,tskip=0,sskip=0;
        while(i>=0 || j>=0){
            while(j>=0){
            if(t.charAt(j)=='#'){
                tskip++;
                j--;
            } 
            else if(tskip>0){ tskip--;
            j--;
            }
            else break;
            }
            while(i>=0){
            if(s.charAt(i)=='#'){
                sskip++;
                i--;
            } 
            else if(sskip>0){ sskip--;
            i--;
            }
            else break;
            }

            if(i>=0 && j>=0 && s.charAt(i)!=t.charAt(j)) return false;
            if((i>=0 && j<0)||(i<0 && j>=0)) return false;
            i--;
            j--;
        }
        return true;
    }
    
}