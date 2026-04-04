public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}
    // Static block for initialization
    static {
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }
    // Public method to get the instance
   public static StaticBlockSingleton getInstance(){
      return instance;
   }
}
