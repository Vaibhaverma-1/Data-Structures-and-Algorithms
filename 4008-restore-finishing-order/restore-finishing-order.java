class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<friends.length; i++){
            set.add(friends[i]);
        }
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0; i<order.length; i++){
            if(set.contains(order[i])){
               list.add(order[i]);
            }
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}