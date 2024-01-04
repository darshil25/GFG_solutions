class Solution {
    static int singleElement(int[] arr , int N) {
        Map<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < arr.length; i++) { 
            int freq = map.getOrDefault(arr[i], 0); 
            map.put(arr[i], freq + 1); 
        } 
        for (int i = 0; i < arr.length; i++) { 
            if (map.get(arr[i]) == 1) { 
                return arr[i]; 
            } 
        } 
        return -1;
    }
}
