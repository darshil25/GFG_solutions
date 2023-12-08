class Solution {
  public List<List<String>> accountsMerge(List<List<String>> accounts) {
    Map<String, Integer> emailIdx = new HashMap<>();
        // Email to name map
        Map<String, String> emailToName = new HashMap<>();
        // Parent array for DSU
        int[] parent = new int[10000]; // assuming maximum 10000 nodes
        for (int i = 0; i < 10000; i++) parent[i] = i; // initially, each node is its own parent
        
        int id = 0;
        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String currEmail = account.get(i);
                if (!emailIdx.containsKey(currEmail)) {
                    emailIdx.put(currEmail, id++);
                    emailToName.put(currEmail, name);
                }
                // Union the first email with the current email
                int firstEmailIdx = emailIdx.get(account.get(1));
                int currEmailIdx = emailIdx.get(currEmail); 
                union(firstEmailIdx, currEmailIdx, parent); 
            }
        }
        
        // Grouping emails that belong to the same set
        Map<Integer, TreeSet<String>> groups = new HashMap<>();
        for (String email : emailIdx.keySet()) {
            int root = find(emailIdx.get(email), parent);
            groups.computeIfAbsent(root, x -> new TreeSet<>()).add(email);
        }
        
        // Constructing the answer
        List<List<String>> result = new ArrayList<>();
        for (TreeSet<String> group : groups.values()) {
            List<String> account = new ArrayList<>();
            account.add(emailToName.get(group.first())); // add name
            account.addAll(group); // add emails
            result.add(account);
        }
        return result;
    }
    
    // Find operation with path compression
    private int find(int x, int[] parent) {
        int p = parent[x];
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }
    
    // Union operation
    private void union(int x, int y, int[] parent) {
        parent[find(x, parent)] = find(y, parent);
    }
}
