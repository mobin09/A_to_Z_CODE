public class Str0004 {
    public static void main(String[] args){
        String s = "abcde";
        String t = "edbac";
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            String ch = s.charAt(i)+"";
            int x = t.indexOf(ch);
            int diff = i -x;
           sum += Math.abs(diff);
        } 
        System.out.println(sum);
    }
}
