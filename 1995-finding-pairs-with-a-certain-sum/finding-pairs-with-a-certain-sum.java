import java.util.HashMap;
import java.util.Map;

class FindSumPairs {
    int[] nums1;
    int[] nums2;
    Map<Integer, Integer> freq;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        freq = new HashMap<>();
        for (int x : nums2) {
            if (freq.containsKey(x)) {
                freq.put(x, freq.get(x) + 1);
            } else {
                freq.put(x, 1);
            }
        }
    }
    
    public void add(int index, int val) {
        int oldVal = nums2[index];
        int oldCount = freq.get(oldVal) - 1;
        if (oldCount == 0) {
            freq.remove(oldVal);
        } else {
            freq.put(oldVal, oldCount);
        }

        nums2[index] += val;
        int newVal = nums2[index];

        if (freq.containsKey(newVal)) {
            freq.put(newVal, freq.get(newVal) + 1);
        } else {
            freq.put(newVal, 1);
        }
    }
    
    public int count(int tot) {
        int c = 0;
        for (int x : nums1) {
            int need = tot - x;
            if (freq.containsKey(need)) {
                c += freq.get(need);
            }
        }
        return c;
    }
}
