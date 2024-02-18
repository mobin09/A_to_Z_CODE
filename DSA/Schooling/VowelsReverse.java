package Schooling;

import java.util.ArrayList;
import java.util.List;

public class VowelsReverse {
      public static void main(String[] args){
        String str = "Practice";
        char[] ch = str.toCharArray();
        int i=0;
        int n = ch.length;
        int j = n-1;
        List<Character> arr= new ArrayList<>();
        arr.add('a');
        arr.add('e');
        arr.add('i');
        arr.add('o');
        arr.add('u');
        while(i <= n/2 && j > n/2 ){
            char f = ch[i];
            char l = ch[j];
            
            if(arr.contains(f)){
              
                  if(arr.contains(l)){
                    //  swap(ch, i, j);
                     
                  }
              
            }

            i++;
            j--;

        }
     }
}
