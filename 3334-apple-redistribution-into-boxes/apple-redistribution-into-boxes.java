class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
      int n = apple.length;
      int m = capacity.length;
      int apples = 0;
      int capacities =0;
      for(int i=0; i<n; i++){
        apples+=apple[i];
      }
      int count=0;
      Arrays.sort(capacity);
      int i=m-1;
      while(apples>0 && i>=0){
        apples-=capacity[i];
        count++;
        i--;

      }
      return count;

    }
}