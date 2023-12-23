class Solution
{
    public:
    //Function to find all elements in array that appear more than n/k times.
    int countOccurence(int arr[], int n, int k) {
        int threshold = n / k;

    unordered_map<int, int> freqMap;

    for (int i = 0; i < n; i++) {
        freqMap[arr[i]]++;
    }

    int count = 0;
    for (auto it : freqMap) {
        if (it.second > threshold) {
            count++;
        }
    }

    return count;
    }
};
