import java.util.*;

class Bucket {
    private List<Integer> bucketContainer;
    public Bucket(){
        this.bucketContainer = new LinkedList<>();
    }

    public void insert(Integer val){
        int index = this.bucketContainer.indexOf(val);
        if(index == -1){
            // value is not present in the bucket
            this.bucketContainer.add(val);
        }
    }

    public void remove(Integer val){
        int index = this.bucketContainer.indexOf(val);
        if(index != -1){
            this.bucketContainer.remove(val);
        }
    }

    public boolean contains(Integer key){
       return this.bucketContainer.indexOf(key) != -1;
    }

}


class MyHashSet {
    int numBucket = 769;
    Bucket[] buckets;

    public MyHashSet() {
        this.buckets = new Bucket[this.numBucket];
        for(int i = 0; i<numBucket; i++){
            this.buckets[i] = new Bucket();
        }
    }
    
    public int getHashfn(int key){
        return key % numBucket;
    }

    public void add(int key) {
           buckets[getHashfn(key)].insert(key);
    }
    
    public void remove(int key) {
        buckets[getHashfn(key)].remove(key);
    }
    
    public boolean contains(int key) {
      return  buckets[getHashfn(key)].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */