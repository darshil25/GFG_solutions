class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
       ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> Qi = new LinkedList<>();

        int i;
        for (i = 0; i < k; ++i) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
            Qi.addLast(i);
        }

        for (; i < n; ++i) {
            result.add(arr[Qi.peek()]);

            while (!Qi.isEmpty() && Qi.peek() <= i - k)
                Qi.removeFirst();

            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();

            Qi.addLast(i);
        }

        result.add(arr[Qi.peek()]);
        return result;
    }
}
