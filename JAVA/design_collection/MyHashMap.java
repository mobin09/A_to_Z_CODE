import java.util.*;

// Pair
class Pair<K, V> {
    K key;
    V value;
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
}

// Bucket
class Bucket {
    List<Pair<Integer, Integer>> list = new LinkedList<>();
    public void addPair(Integer key, Integer value){
        for(Pair<Integer,Integer> p : list){
            if(p.key.equals(key)){
                p.value = value;
                return;
            }
        }
        list.add(new Pair<Integer, Integer>(key, value));
    }

    public int getValue(Integer key){
        for(Pair<Integer, Integer> p : list){
            if(p.key.equals(key)){
                return p.value;
            }
        }
        return -1;
    }

    public void removePair(Integer key){
        for(Pair<Integer, Integer> p: list){
            if(p.key.equals(key)){
                list.remove(p);
                return;
            }
        }
    }
}





class MyHashMap {
    int bucketNumber = 769;
    Bucket[] bucket;
    public MyHashMap() {
        bucket = new Bucket[bucketNumber];
        for(int i=0; i<bucketNumber; i++){
            bucket[i] = new Bucket();
        }
    }
    
    private int getIndexBucketbyHash(int key){
        return key % bucketNumber;
    }


    public void put(int key, int value) {
        bucket[getIndexBucketbyHash(key)].addPair(key, value);
    }
    
    public int get(int key) {
        return bucket[getIndexBucketbyHash(key)].getValue(key);
    }
    
    public void remove(int key) {
         bucket[getIndexBucketbyHash(key)].removePair(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */