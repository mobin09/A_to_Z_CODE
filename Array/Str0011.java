public class Str0011 {
     public static void main(String[] args) {
        String s = "poiinter";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'i'){
                sb.reverse();
            }else{
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());

     }
}
