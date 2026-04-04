public class EagerSingleton {
    // Holds the single shared instance (created immediately at class load time)
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor prevents creating objects from outside the class
    private EagerSingleton(){}
    // Global access point to get the Singleton instance
    public static EagerSingleton getInstace(){
        // Return the already-created shared instance
        return instance;
    }
}