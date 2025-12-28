
import java.util.*;
public class Day011 {
    public static boolean assambleString(String str){
        boolean isAllCapital = true;
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 65 && ch <= 90 ){
                count++;
            }
        }

        if(count != str.length()){
            isAllCapital = false;
        }
     return isAllCapital;
   
    }
    public static void main(String[] args){
      	// your code goes here
          Scanner sc = new Scanner(System.in);
          int T = Integer.parseInt(sc.nextLine());
          while(T--> 0){
            System.out.println("Plz entered string");
              String s = sc.nextLine();
              //System.out.println(s);
              String[] arr = s.split(" ");
              StringBuilder sb = new StringBuilder();
              
              for(int i=0; i<arr.length; i++){
                  String first = arr[i].substring(0, 1)
                  .toUpperCase();
                  String second = arr[i].substring(1);
                    boolean  b = assambleString(second);
                    if(b == false){
                        second = second.toLowerCase(); 
                    }
                 sb.append(first + second + " ");
              }
              
              System.out.println(sb.toString());
              
          }
          sc.close();
                      
    }
}
