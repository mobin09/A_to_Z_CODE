public class Str0017{
    public static void main(String[] args) {
        String str = "a1c1e1";
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            int current = str.charAt(i);
            if(i % 2 == 0){
                sb.append((char)current);
            }else{
                int prev = str.charAt(i-1);
                sb.append((char)(current + prev - 48));
            }
        }
        
        System.out.println(sb.toString());
        //System.out.println((int)'1');
    }
}