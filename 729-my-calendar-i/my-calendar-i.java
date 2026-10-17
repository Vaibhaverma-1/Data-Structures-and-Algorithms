class MyCalendar {
    List<int[]> events;
    public MyCalendar() {
        events = new ArrayList<>();
        
    }
    
    public boolean book(int startTime, int endTime) {
        int n = events.size();
        if(n==0) events.add(new int[]{startTime,endTime});
        for(int i=0; i<n; i++){
            int[] curr = events.get(i);
            int s = curr[0];
            int e = curr[1];
            if(startTime<e && endTime>s){
                return false;
            }
        }
        events.add(new int[]{startTime,endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */