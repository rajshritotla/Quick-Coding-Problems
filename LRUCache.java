import java.util.HashMap;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

class LRUCache {

    private int cap;
    Deque<Integer> dq;
    HashMap<Integer,Integer> map;
    
    public LRUCache(int capacity) {    
        cap = capacity;
        dq  = new LinkedList<Integer>();
        map = new HashMap<Integer,Integer>();
    }
    
    public int get(int key) {
        if(map.containsKey(key))
            return map.get(key);
        else
            return -1;
    }
    
    public void put(int key, int value) {
        
           if(!map.containsKey(key)) {
                if(dq.size()==cap){
                   int last = dq.pollLast();
                   map.remove(last);
               }        
           }else{
               int index =0, i=0;
               Iterator<Integer> iq = dq.iterator();
               while(iq.hasNext()){
                   if(iq.next()==key){
                        index=i;
                        break;
                   }
                   i++;
               }
               dq.remove(index);
           }
        dq.add(key);
        map.put(key,value);        
    }


}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

