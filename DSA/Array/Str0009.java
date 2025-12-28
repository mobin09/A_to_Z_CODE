public class Str0009 {
    public static void main(String[] args){
        String s = "Hello";
       // System.out.println((char)('H' + 32));
        char[] ch = s.toCharArray();
        for(int i=0; i < ch.length; i++){
            if(ch[i]  <= 'Z'  && ch[i] >= 'A'){
                ch[i] = (char)(ch[i] + 32);
            }
        }

        s = String.valueOf(ch);
        System.out.println(s);


    }
}
