package recursive;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private static final int UNVISITED = 0;
    private static final int VISITED = 1;

    public static void main(String[] args) {
        int [][] graph = {
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 0, 1},
                {0, 1, 1, 0}
        };
        int n = graph.length;

        int[] status = new int[n];  // UNVISITED or VISITED
        int[] distance = new int[n]; // Distance from the source vertex
        int[] parent = new int[n];  // Parent vertex in the BFS tree

        bfs(graph, 0, status, distance, parent);

        System.out.println("BFS traversal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Distances from source: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Distance of " + i + " from 0: " + distance[i]);
        }
    }

    private static void bfs(int[][] graph, int source, int[] status, int[] distance, int[] parent) {
        Queue<Integer> queue = new LinkedList<>();
        status[source] = VISITED;
        distance[source] = 0;
        parent[source] = -1;  // Source has no parent
        queue.add(source);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] == 1 && status[v] == UNVISITED) {
                    status[v] = VISITED;
                    distance[v] = distance[u] + 1;
                    parent[v] = u;
                    queue.add(v);
                }
            }
        }
    }
}
