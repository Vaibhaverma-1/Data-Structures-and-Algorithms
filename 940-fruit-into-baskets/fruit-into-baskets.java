import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;
        int l = 0, r = 0;

        while (r < n) {
            int freq = 0;
            if (map.containsKey(fruits[r])) {
                freq = map.get(fruits[r]);
            }
            freq++;
            map.put(fruits[r], freq);

            if (map.size() > 2) {
                
                int temp = map.get(fruits[l]);
                temp--;
                map.put(fruits[l], temp);
                if (temp == 0) {
                    map.remove(fruits[l]);
                }
                l++;  // **Fixed: Increment left pointer**
                
            }
            else{
            maxlen = Math.max(maxlen, r - l + 1);  // Always update max length
            
            }
            r++;
        }
        return maxlen;
    }
}
