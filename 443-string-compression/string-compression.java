class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0, n = chars.length;

        while(i < n){
            char start = chars[i];
            int count = 0;

            while(i < n && chars[i] == start){
                count++;
                i++;
            }

            chars[j++] = start;

            if(count > 1){
                String s = String.valueOf(count);
                for(int k = 0; k < s.length(); k++){
                    chars[j++] = s.charAt(k);
                }
            }
        }

        return j;
    }
}