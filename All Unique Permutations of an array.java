class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> currentPermutation = new ArrayList<>();
        boolean[] used = new boolean[n];
        
        // Sort the input array to handle duplicates
        Collections.sort(arr);
        
        generatePermutations(arr, n, used, currentPermutation, result);
        
        return result;
    }

    static void generatePermutations(ArrayList<Integer> arr, int n, boolean[] used,
                                     ArrayList<Integer> currentPermutation, ArrayList<ArrayList<Integer>> result) {
        // If the current permutation size is equal to the input array size, add it to the result
        if (currentPermutation.size() == n) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int i = 0; i < n; i++) {
            // Skip used elements
            if (used[i]) continue;

            // Avoid duplicates
            if (i > 0 && arr.get(i).equals(arr.get(i - 1)) && !used[i - 1]) continue;

            // Add current element to the permutation
            currentPermutation.add(arr.get(i));
            used[i] = true;

            // Recursively generate permutations for the remaining elements
            generatePermutations(arr, n, used, currentPermutation, result);

            currentPermutation.remove(currentPermutation.size() - 1);
            used[i] = false;
        }
    }
};
