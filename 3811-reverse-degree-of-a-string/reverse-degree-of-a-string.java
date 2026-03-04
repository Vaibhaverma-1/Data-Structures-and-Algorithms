class Solution {
    public int reverseDegree(String s) {
        int count=0;
        for(int i=0; i<s.length(); i++){
            int sum = 26-(s.charAt(i)-'a');
            count+=sum*(i+1);
        }
        return count;
    }
}