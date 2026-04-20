import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;

public enum CacheManager {
    INSTANCE;

    private record CacheEntry(String value, Instant expiry) {
          boolean isExpired(){
            return expiry != null && Instant.now().isAfter(expiry);
          } 
    }

    private final ConcurrentHashMap<String, CacheEntry> cache = new ConcurrentHashMap<>();

    public void put(String key, String value, long ttlSeconds){
        Instant expiry = ttlSeconds > 0 ? Instant.now().plusSeconds(ttlSeconds) : null;
        cache.put(key, new CacheEntry(value, expiry));
    }

    public void put(String key, String value){
        put(key, value, 0);
    }

    public String get(String key){
       CacheEntry entry =  cache.get(key);
       if(entry == null) return null;
       if(entry.isExpired()){
         cache.remove(key);
         return null;
       }
       return entry.value;
    }

    public void remove(String key){
        cache.remove(key);
    }

    public int size(){
        cache.entrySet().removeIf(entry -> entry.getValue().isExpired());
        return cache.size();
    }


}
