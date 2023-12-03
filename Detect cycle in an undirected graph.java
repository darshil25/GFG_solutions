class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
            parent[i] = -1;
        }

        for (int u = 0; u < V; u++) {
            if (!visited[u]) {
                if (isCyclicUtil(u, visited, parent, adj))
                    return true;
            }
        }

        return false;
    }

    private boolean isCyclicUtil(int v, boolean[] visited, int[] parent, ArrayList<ArrayList<Integer>> adj) {
        LinkedList<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.add(v);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            Iterator<Integer> it = adj.get(current).iterator();
            while (it.hasNext()) {
                int next = it.next();

                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    parent[next] = current;
                } else if (parent[current] != next) {

                    return true;
                }
            }
        }

        return false;
    }
}
