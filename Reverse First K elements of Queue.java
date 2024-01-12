class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        if (k <= 0 || k > q.size()) {
            // Invalid value of k
            return q;
        }

        // Use a stack to reverse the first K elements
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        // Enqueue the reversed elements back to the queue
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        // Enqueue the remaining elements back to the queue
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }

        return q;
    }
}
