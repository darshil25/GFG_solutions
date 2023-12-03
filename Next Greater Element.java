class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] result = new long[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peekLast()] < arr[i]) {
                int index = stack.removeLast();
                result[index] = arr[i];
            }
            stack.addLast(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.removeLast();
            result[index] = -1;
        }

        return result;
    } 
}
