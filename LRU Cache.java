class LRUCache
{
    //Constructor for initializing the cache capacity with the given value.
    private LinkedHashMap<Integer, Integer> map;
    private final int CAPACITY;
    LRUCache(int cap)
    {
        CAPACITY = cap;
        map = new LinkedHashMap<Integer, Integer>(cap, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest)
            {
                return size() > CAPACITY;
            }
        };
    }

    //Function to return value corresponding to the key.
    public  int get(int key)
    {
        return map.getOrDefault(key, -1);
    }

    //Function for storing key-value pair.
    public  void set(int key, int value)
    {
        map.put(key, value);
    }
}
