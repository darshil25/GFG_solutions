class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();

        int result = -1;

        for (int i = n - 1; i >= 0; i--) {
           
            if (set.contains(arr[i])) {
                result = i + 1; 
            } else {
               
                set.add(arr[i]);
            }
        }

        return result;
    }
}
