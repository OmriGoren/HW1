public class Assignment01Q05 {

    public  static int findShortestPathRec(int[][] m, int i, int j, boolean[] visited) {
        if (i==j) {
            return 0;
        }
        int minPath = m.length + 1;
        for (int k = 0; k < m.length; k++) 
        {
            if (m[i][k]==1 && !visited[k])
            {
                visited[k] = true;
                minPath = Math.min(minPath, 1 + findShortestPathRec(m, k, j, visited));
                visited[k] = false;
            }
        }
        return minPath;
    }

    public static int findShortestPath(int[][] m, int i, int j) {
        boolean[] visited = new boolean[m.length];
        visited[i] = true;
        int minPath = findShortestPathRec(m, i, j, visited);
        if (minPath <= m.length) {
            return minPath;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}