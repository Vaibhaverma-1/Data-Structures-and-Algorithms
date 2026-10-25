import java.util.*;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                provinces++;
                bfs(isConnected, i, visited);
            }
        }

        return provinces;
    }

    void bfs(int[][] grid, int start, boolean[] visited) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int city = q.poll();

            for (int j = 0; j < grid.length; j++) {
                if (grid[city][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    q.offer(j);
                }
            }
        }
    }
}