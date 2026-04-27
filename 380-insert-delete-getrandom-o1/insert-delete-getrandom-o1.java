class RandomizedSet {
    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }  
        list.add(val);
        map.put(val,list.size()-1); 
        return true;    
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int index = map.get(val);
        int last = list.get(list.size()-1);
        map.put(last, index);
        list.set(index, last);
        list.remove(list.size()-1);
        
        map.remove(val);
        return true;

        
    }
    
    public int getRandom() {
        int x = (int)(Math.random() * (list.size()));
        return list.get(x);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */