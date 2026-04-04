public class LazySingleton {
    // Holds the single shared instance (initially not created)
    private static LazySingleton instance;
    // Private constructor prevents creating objects from outside the class
    private LazySingleton(){}
    
    // Global access point to get the Singleton instance
    public static LazySingleton getInstance(){
           // Create the instance only when first requested (lazy initialization)
          if(instance == null){
               instance = new LazySingleton();
          }
          // Return the shared instance
          return instance;
    }
}