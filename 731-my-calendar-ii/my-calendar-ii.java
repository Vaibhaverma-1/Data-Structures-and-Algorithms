class MyCalendarTwo {
    List<int[]> bookings;
    List<int[]> overlaps;

    public MyCalendarTwo() {
        bookings=new ArrayList<>();
        overlaps=new ArrayList<>();
    }

    public boolean book(int startTime,int endTime) {

        // Check if triple booking would occur
        for(int[] curr:overlaps){
            if(startTime<curr[1] && endTime>curr[0]){
                return false;
            }
        }

        // Find new double-booked intervals
        for(int[] curr:bookings){
            int start=Math.max(startTime,curr[0]);
            int end=Math.min(endTime,curr[1]);

            if(start<end){
                overlaps.add(new int[]{start,end});
            }
        }

        bookings.add(new int[]{startTime,endTime});
        return true;
    }
}