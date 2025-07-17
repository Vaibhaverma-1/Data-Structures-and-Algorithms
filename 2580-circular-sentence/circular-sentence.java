class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = trimmer(sentence);

        
        if (arr[0].charAt(0) != arr[arr.length - 1].charAt(arr[arr.length - 1].length() - 1)) {
            return false;
        }

        
        for (int i = 0; i < arr.length - 1; i++) {
            char e = arr[i].charAt(arr[i].length() - 1);
            char s = arr[i + 1].charAt(0);
            if (e != s) {
                return false;
            }
        }
        return true;
    }

    public String[] trimmer(String s) {
        String[] sen = s.trim().split("\\s+");
        return sen;
    }
}