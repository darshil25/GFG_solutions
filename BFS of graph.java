class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Mark the source node as visited and enqueue it
        visited[0] = true;
        queue.add(0);
        result.add(0);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue and print it
            int currentVertex = queue.poll();

            // Get all adjacent vertices of the dequeued vertex
            for (int neighbor : adj.get(currentVertex)) {
                // If a neighbor has not been visited, mark it as visited and enqueue it
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    result.add(neighbor);
                }
            }
        }

        return result;
    }
}
