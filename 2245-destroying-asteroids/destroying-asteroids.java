class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m =(long)mass;
        int n = asteroids.length;
        for(int i=0; i<n; i++){
            if(m>=asteroids[i]){
                m+=asteroids[i];
            }
            else{
                return false;
            }
        }
        return true;
    }
}