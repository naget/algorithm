package practice;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by tianfeng on 2018/4/21.
 */
public class LRUByLinkedHashMap<K,V> extends LinkedHashMap<K,V>{
    private final int MAX_SIZE;
    public LRUByLinkedHashMap(int size){
        super(size,0.75f,true);
        MAX_SIZE = size;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size()>MAX_SIZE;
    }

    public static void main(String[] args) {
        LRUByLinkedHashMap<Integer,Integer> lru = new LRUByLinkedHashMap<>(5);
        for (int i=0;i<10;i++){
            lru.put(i,i);
            lru.get(1);
        }
        System.out.println(lru.get(5));
    }
}
