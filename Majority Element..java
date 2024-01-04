class Solution
{
    static int majorityElement(int a[], int size)
    {
        int candidate = findCandidate(a, size);

        if (isMajority(a, size, candidate)) {
            return candidate;
        }

        return -1;
    }

    static int findCandidate(int a[], int size) {
        int candidate = a[0];
        int count = 1;

        for (int i = 1; i < size; i++) {
            if (a[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = a[i];
                count = 1;
            }
        }

        return candidate;
    }

    static boolean isMajority(int a[], int size, int candidate) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (a[i] == candidate) {
                count++;
            }
        }

        return count > size / 2;
    }
}
