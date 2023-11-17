class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
       int[] inDegree
            = new int[V]; 
        Queue<Integer> q
            = new LinkedList<>(); 
        int visited = 0; 
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                inDegree[v]++;
            }
        }
 
        
        for (int u = 0; u < V; u++) {
            if (inDegree[u] == 0) {
                q.add(u);
            }
        }
 

        while (!q.isEmpty()) {
            int u = q.poll();
            visited++;
 
 
            for (int v : adj.get(u)) {
                inDegree[v]--;
               
                if (inDegree[v] == 0) {
                    q.add(v);
                }
            }
        }
 
        return visited != V;
    }
}
