class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int target = skill[0]+skill[n-1];
        int i=0,j=n-1;
        long chemistry=0;
        while(i<=j){
            if(skill[i]+skill[j]==target){
                chemistry+=skill[i]*skill[j];
                
            }
            else{
                return -1;
            }
            i++;
            j--;
            
        }
       
        return chemistry;
    }
}