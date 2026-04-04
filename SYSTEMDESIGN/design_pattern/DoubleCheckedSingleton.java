public class DoubleCheckedSingleton {
    
    // Holds the single shared instance (requires safe publication)
	// volatile prevents reordering of instructions in: instance = new Singleton()
	// since it involves three steps: allocate memory, call constructor, assign reference

    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton(){}


    public static DoubleCheckedSingleton getInstance(){
       	
        // Fast path: first check without locking
        if(instance == null){
            // Lock only when the instance might need to be created
              synchronized(DoubleCheckedSingleton.class){
                // Second check inside the lock (prevents double creation) 
                if(instance == null){
                instance = new DoubleCheckedSingleton();
                }  
            }
        }
        // Return the shared instance (existing or newly created)
        return instance;
    }
}
