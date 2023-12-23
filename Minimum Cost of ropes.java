class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        // Add all the ropes to the priority queue
        for (int i = 0; i < n; i++) {
            minHeap.add(arr[i]);
        }

        // Initialize the total cost
        long totalCost = 0;

        // Connect the ropes until only one rope remains in the priority queue
        while (minHeap.size() > 1) {
            // Extract the two smallest ropes from the priority queue
            long first = minHeap.poll();
            long second = minHeap.poll();

            // Calculate the cost of connecting the two ropes
            long cost = first + second;

            // Add the cost to the total cost
            totalCost += cost;

            // Add the newly created rope back to the priority queue
            minHeap.add(cost);
        }

        return totalCost;
    }
}
