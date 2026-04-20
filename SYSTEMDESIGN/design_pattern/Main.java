

public class Main {
    public static void main(String[] args) {
        // Both references point to the same CacheManager instance
        CacheManager cache1 = CacheManager.INSTANCE;
        CacheManager cache2 = CacheManager.INSTANCE;
    
        System.out.println("Same instance? " + (cache1 == cache2)); // true
        // Component A caches data
        cache1.put("user:42", "{name: 'Alice'}", 5); // 5-second TTL
        cache1.put("config:theme", "dark");           // no expiry

         // Component B reads from the same cache
        System.out.println("user:42 = " + cache2.get("user:42"));       // {name: 'Alice'}
        System.out.println("config:theme = " + cache2.get("config:theme")); // dark
        System.out.println("Cache size: " + cache2.size());              // 2

    }
}



