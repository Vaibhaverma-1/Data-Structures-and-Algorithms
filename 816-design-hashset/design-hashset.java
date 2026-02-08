class Node{
    int val;
    Node next;
    Node( int val){
        this.val = val;
        this.next = null;
    }
    Node(int val,Node next){
        this.val = val;
        this.next = next;
    }
}
class MyHashSet {
    int n = 10000;
    Node[] arr;
    
    public MyHashSet() {
       arr= new Node[n];
    }
    
    public void add(int key) {
    int bucket = key % n;

    if (arr[bucket] == null) {
        arr[bucket] = new Node(key);
        return;
    }

    Node ptr = arr[bucket];
    while (ptr.next != null) {
        if (ptr.val == key) return;
        ptr = ptr.next;
    }

    if (ptr.val == key) return;

    ptr.next = new Node(key);
}

    
 public void remove(int key) {
    int bucket = key % n;
    Node ptr = arr[bucket];

    if (ptr == null) return;

    if (ptr.val == key) {
        arr[bucket] = ptr.next;
        return;
    }

    Node prev = ptr;
    ptr = ptr.next;

    while (ptr != null) {
        if (ptr.val == key) {
            prev.next = ptr.next;
            return;
        }
        prev = ptr;
        ptr = ptr.next;
    }
}

    
    public boolean contains(int key) {
        int bucket = key %n;
        Node ptr = arr[bucket];
        if(ptr==null) return false;

        while(ptr != null){
            if(ptr.val==key){
                return true;
            }
            ptr= ptr.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */