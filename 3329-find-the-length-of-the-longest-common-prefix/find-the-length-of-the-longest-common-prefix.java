class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr1.length;
        for(int i=0; i<n; i++){
            String s = String.valueOf(arr1[i]);
            for(int j=1; j<=s.length(); j++){
                set.add(Integer.parseInt(s.substring(0,j)));
            }
        }
        int m = arr2.length;
        int len=0;
        for(int i=0; i<m; i++){
            String s = String.valueOf(arr2[i]);
            for(int j=1; j<=s.length(); j++){
                int prefix = Integer.parseInt(s.substring(0,j));
                if(!set.contains(prefix)){
                    break;
                }
                else{
                    len = Math.max(len,j);
                }
            }
        }
        return len;

    }
}