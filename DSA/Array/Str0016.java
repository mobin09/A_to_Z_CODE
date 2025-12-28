public class Str0016 {
    public static void main(String[] args) {
        int n = 10;
        StringBuilder sb = new StringBuilder();
        String a = "a";
        if(n % 2 == 0){
           a= a.repeat(n-1);
            sb.append(a);
            sb.append("b");
        }else{
            a = a.repeat(n);
            sb.append(a);
        }

        System.out.println(sb.toString());
      String s = "Mobin";
      System.out.println(s.substring(0,1));

      String s1= "Hello World";
String s2= new String ("Hello World");
String s3= new String ("Hello World");
String s4 = s3;
 
System.out.print(s1== s2);
System.out.print(s1== s3);
System.out.print(s2== s3);
System.out.print(s1== s4);
    }
}
