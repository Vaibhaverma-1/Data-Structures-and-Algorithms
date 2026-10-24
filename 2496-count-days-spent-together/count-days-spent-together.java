class Solution {
    public int countDaysTogether(String arriveAlice,
    String leaveAlice, String arriveBob, String leaveBob)
    {  int[] months = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       int first = Math.max(countDays(arriveAlice, months),countDays(arriveBob, months));
       int last = Math.min(countDays(leaveAlice,months),countDays(leaveBob,months));
       if(first>last) return 0;
       return last-first+1;

        
    }
 
    int countDays(String date, int[] months){
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3,5));
        if(month==1) return day;
        int count=0;
        for(int i=1; i<month;i++){
            count+=months[i];
        }
        count+=day;
        return count;
        
    }
}