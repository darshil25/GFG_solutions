class Solution {
    public static ArrayList<ArrayList<Integer>> kTop(int[] arr, int n, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(); 
        Map<Integer, Integer> freqMap = new HashMap<>();
        Map<Integer, Set<Integer>> map = new TreeMap<Integer, Set<Integer>>((x, y)->y-x);
        
        for(int i = 0; i<n; i++){
            int val = arr[i];
            int oldVal = freqMap.getOrDefault(val, 0);
            freqMap.put(val, oldVal + 1);
            
            //add in newVal
            Set<Integer> cSet = map.getOrDefault(oldVal + 1, new TreeSet<Integer>((x, y)-> x - y));
            cSet.add(val);
            map.put(oldVal + 1, cSet);
            
            //remove in olderVal
            if(oldVal != 0){
                Set<Integer> set = map.get(oldVal);
                set.remove(val);
            }
            
            //populate list
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j<k; ){
                for(int freq : map.keySet()){
                    for(int itVal: map.get(freq)){
                        list.add(itVal);
                        j++;
                    }
                }
                break;
            }
            if(list.size() > k){
                while(list.size() > k){
                    list.remove(k);
                }
            }
            res.add(list);
        }
        return res;
    }
}
