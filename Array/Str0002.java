public class Str0002 {
    public static void main(String[] args) {
        String str = "BABAB";
        int pointA = 0;
        int pointB = 0;
        String whoisServer = "Alice";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(whoisServer.equals("Alice")){
                if(ch == 'A'){
                    pointA++;
                }else{
                    whoisServer = "Bob";
                }
            }
            else if(whoisServer.equals("Bob")){
                if(ch == 'B'){
                    pointB++;
                }else{
                    whoisServer = "Alice";
                }
            }
        }
        System.out.println("Alice point:" + pointA +"\nBob Point:"+pointB);
    }
}
