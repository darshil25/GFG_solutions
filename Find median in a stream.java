class Solution
{
    static PriorityQueue<Integer> maxHeap; // max heap for the lower half
    static PriorityQueue<Integer> minHeap; // min heap for the upper half

    public static void insertHeap(int x) {
        if (maxHeap == null) {
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        }
        if (minHeap == null) {
            minHeap = new PriorityQueue<>();
        }

        if (maxHeap.isEmpty() || x <= maxHeap.peek()) {
            maxHeap.add(x);
        } else {
            minHeap.add(x);
        }
        balanceHeaps();
    }

    public static void balanceHeaps() {
        if (Math.abs(maxHeap.size() - minHeap.size()) > 1) {
            if (maxHeap.size() > minHeap.size()) {
                minHeap.add(maxHeap.poll());
            } else {
                maxHeap.add(minHeap.poll());
            }
        }
    }

    public static double getMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } else {
            return minHeap.peek();
        }
    }
}
