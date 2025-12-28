import java.util.concurrent.CopyOnWriteArrayList;

import java.util.Iterator;

public class Day7 {
    public static void main(String[] args){      
        CopyOnWriteArrayList<String> list =new CopyOnWriteArrayList<>();  
      list.add("Concurrent Collection");
      list.add("CopyOnWriteArrayList");
      list.add("java.util.concurrent");
      list.add("java 8");

      list.add("A");
      list.addIfAbsent("A");

      Iterator<String> it = list.iterator();
      while(it.hasNext()){
        System.out.println(it.next());
      }

      System.out.println(list);
    }
}
