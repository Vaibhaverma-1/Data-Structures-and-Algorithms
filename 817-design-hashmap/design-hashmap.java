class Node {
    int key, val;
    Node next;

    Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class MyHashMap {
    Node[] arr;
    int n = 10000;

    public MyHashMap() {
        arr = new Node[n];
    }

    public void put(int key, int value) {
        int bucket = key % n;
        Node temp = arr[bucket];

        if (temp == null) {
            arr[bucket] = new Node(key, value);
            return;
        }

        while (temp != null) {
            if (temp.key == key) {
                temp.val = value;
                return;
            }
            if (temp.next == null) break;
            temp = temp.next;
        }

        temp.next = new Node(key, value);
    }

    public int get(int key) {
        int bucket = key % n;
        Node temp = arr[bucket];

        while (temp != null) {
            if (temp.key == key) return temp.val;
            temp = temp.next;
        }
        return -1;
    }

    public void remove(int key) {
        int bucket = key % n;
        Node temp = arr[bucket];

        if (temp == null) return;

        if (temp.key == key) {
            arr[bucket] = temp.next;
            return;
        }

        while (temp.next != null) {
            if (temp.next.key == key) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */