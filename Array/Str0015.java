import java.util.HashMap;
import java.util.Set;

import java.util.Iterator;
import java.util.Map;

public class Str0015 {
    public static void main(String[] args) {
        String str = "abacbc";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                Integer cnt = map.get(ch);
                map.put(ch, ++cnt);
            }else{
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        Set<Character> set = map.keySet();
        Iterator<Character> it = set.iterator();
        Map.Entry<Character, Integer>m = map.entrySet().iterator().next();
        int count = m.getValue();
        //int count = 0;
        while(it.hasNext()){
            Character c = it.next();
            Integer i =map.get(c);
            if(count != i){
                System.out.println("Not Equal");
                return;
            }



        }
      
        System.out.println("Equal value");

    }
}
