class Solution {

    public boolean canReach(String s, int minJump, int maxJump) {

        int n = s.length();

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(0);
        visited[0] = true;

        // prevents rescanning old ranges
        int farthest = 0;

        while (!q.isEmpty()) {

            int i = q.poll();

            // start scanning only from new territory
            int start = Math.max(i + minJump, farthest + 1);

            int end = Math.min(i + maxJump, n - 1);

            for (int j = start; j <= end; j++) {

                if (s.charAt(j) == '0' && !visited[j]) {

                    if (j == n - 1) {
                        return true;
                    }

                    visited[j] = true;
                    q.offer(j);
                }
            }

            farthest = end;
        }

        return n == 1;
    }
}