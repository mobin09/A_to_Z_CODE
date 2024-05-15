//https://www.codechef.com/practice/course/strings/STRINGS/problems/WORDLE
import java.util.*;
public class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0){
		    String s = sc.next();
		    String t = sc.next();
		    StringBuilder sb = new StringBuilder();
		    for(int i=0; i<s.length(); i++){
		        String s1 = s.charAt(i) +"";
		        String t1 = t.charAt(i)+"";
		        if(s1.equals(t1)){
		            sb.append("G");
		        }else{
		            sb.append("B");
		        }
		    }
            sc.close();
		    
		    System.out.println(sb.toString());
    }
    }
}