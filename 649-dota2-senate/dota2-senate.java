class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new ArrayDeque<>();
        Queue<Integer> dire = new ArrayDeque<>();
        int n = senate.length();
        for(int i=0; i<n; i++){
            if(senate.charAt(i)=='R'){
                radiant.offer(i);
            }
            else{
                dire.offer(i);
            }
        }
        while(!radiant.isEmpty() && !dire.isEmpty()){
            int rad = radiant.poll();
            int dir = dire.poll();
            //whichever comes first will stop the later
            if(dir<rad){
                dire.offer(dir+n);
            }
            else if(rad<dir){
                radiant.offer(rad+n);
            }
        }
        return radiant.isEmpty()?"Dire":"Radiant";
    }
}
//Radiant, DIire
//RRDDD
//queue = FIFO;
//
//rad=[0,1] dire=[2,3,4];
//rad=[0,1] dire=[2,3,];