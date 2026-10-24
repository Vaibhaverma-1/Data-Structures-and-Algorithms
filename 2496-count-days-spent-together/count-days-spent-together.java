class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        String[] dates = {arriveAlice, leaveAlice, arriveBob, leaveBob};
        int[] totalDays = new int[4];

        for(int i=0; i<4; i++){
            int month = Integer.parseInt(dates[i].substring(0,2));
            int day = Integer.parseInt(dates[i].substring(3,5));

            for(int j=1; j<month; j++){
                day += days[j];
            }
            totalDays[i] = day;
        }

        int start = Math.max(totalDays[0], totalDays[2]);
        int end = Math.min(totalDays[1], totalDays[3]);

        return Math.max(0,end-start+1);
    }
}