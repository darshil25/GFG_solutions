int threshold = n / k;

    // Create a hash map to store the frequency of each element
    unordered_map<int, int> freqMap;

    // Traverse the array and update the frequency map
    for (int i = 0; i < n; i++) {
        freqMap[arr[i]]++;
    }

    // Count the elements with frequency greater than the threshold
    int count = 0;
    for (auto it : freqMap) {
        if (it.second > threshold) {
            count++;
        }
    }

    return count;
