/*
Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

The cache is initialized with a positive capacity.

Follow up:
Could you do both operations in O(1) time complexity?

*/

class LRUCache extends LinkedHashMap<Integer,Integer>{

    int cap;
    
    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.cap = capacity;    
    }
    
    public int get(int key) {
        return super.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        super.put(key,value);
    }
        
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
        return size()>cap;    
    }
}
