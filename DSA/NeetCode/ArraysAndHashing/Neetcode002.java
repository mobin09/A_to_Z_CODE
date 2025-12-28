import java.util.Arrays;

public class Neetcode002 {
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";
        char[] ch = s.toCharArray();
        char[] ch1 = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
       String s1 =  String.valueOf(ch);
       String s2 = String.valueOf(ch1);
       System.out.println(s1.equals(s2));
    }
}
