import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class Day4 extends Thread{
    //static HashMap<String, String> map = new HashMap<>();
    static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
    @Override
    public void run(){
          try {
               Thread.sleep(2000);
          } catch (InterruptedException e) {
              
          }
          System.out.println("Child thread updating the map");
          map.put("A", "ABC");
    }

    public static void main(String[] args) {
         map.put("B", "BCD");
         map.put("D", "DEF");
           
         Day4 t  = new Day4();
         t.start();

         Set<String> set = map.keySet();
         Iterator<String> it = set.iterator();
         while(it.hasNext()){
               String key = it.next();
               System.out.println("Main thread reading Map " + key + ":"+ map.get(key));
               try {
                Thread.sleep(3000);
               } catch (InterruptedException e) {
                  
               }
              
         }

        System.out.println(map);


    }

   
}
