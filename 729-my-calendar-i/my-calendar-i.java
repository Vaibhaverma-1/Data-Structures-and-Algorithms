class MyCalendar {
    TreeMap<Integer,Integer> events;

    public MyCalendar() {
        events=new TreeMap<>();
    }

    public boolean book(int startTime,int endTime) {
        Integer prev=events.floorKey(startTime);
        Integer next=events.ceilingKey(startTime);

        if(prev!=null && events.get(prev)>startTime){
            return false;
        }

        if(next!=null && endTime>next){
            return false;
        }

        events.put(startTime,endTime);
        return true;
    }
}