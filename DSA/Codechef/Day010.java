public class Day010 {
    public static void main(String[] args){
        String s = "11";
        int count = 0;
        for(int i=0; i<s.length()-1; i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            if(c1 == c2){
               count++;
            }
        }

        System.out.println(count);

    }
}
