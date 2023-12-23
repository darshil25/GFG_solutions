class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer> setA = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setA.add(a[i]);
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            if (setA.contains(b[i])) {
                count++;
                setA.remove(b[i]);
            }
        }

        return count;
    }
};
