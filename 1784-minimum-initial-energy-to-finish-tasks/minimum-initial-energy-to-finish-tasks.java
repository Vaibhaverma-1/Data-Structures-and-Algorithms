class Solution {
    public int minimumEffort(int[][] tasks) {
        int n = tasks.length;
        Arrays.sort(tasks,(a,b)->(b[1]-b[0])-(a[1]-a[0]));
        int energyReq=0;
        for(int i=0; i<n; i++){
           energyReq+=tasks[i][0];
        }
        int temp = energyReq;
        for(int i=0; i<n; i++)
        {
            if(tasks[i][1]>temp){
              int diff = tasks[i][1]-temp;
              energyReq+=diff;
              temp+=diff;
            }
            temp-=tasks[i][0];
        }
        return energyReq;
    }
    
}