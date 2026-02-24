class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length,count=0,l=0,r=n-1;
        while(l<=r){
            if(people[r]+people[l]<=limit){
                count++;
                l++;
                r--;
            }
            else{
                count++;
                r--;
            }

        }
        return count;
    }
}