import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
public class Day6 extends Thread{
    //static Map<String, String> map = new HashMap<>();
    static ConcurrentHashMap<String, String> chmap = new ConcurrentHashMap<>();
    @Override
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
           
        }

       System.out.println("Child Thread Updating Map");
        chmap.put("Learning", "Concurrent Collection");

    }

    
       public static void main(String[] args) throws InterruptedException{
            chmap.put("Name", "Mobin");
            chmap.put("age", "25");
            chmap.put("Addr", "Gorakhpur");
            chmap.put("State", "up");
          
            Day6 myThread   = new Day6();
            myThread.start();  

           
           
          Set<String> set =  chmap.keySet();
          Iterator<String> it = set.iterator();
          while(it.hasNext()){
            String key = it.next();
            String val = chmap.get(key);

           System.out.println("Key is:" + key + " Value is:" + val);  
           Thread.sleep(3000);
       }

       //git config --global --add safe.directory E:\workspace\A_to_Z_CODE
       //E:\workspace\A_to_Z_CODE

       System.out.println(chmap);

       }

}