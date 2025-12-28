// https://www.codechef.com/practice/course/strings/STRINGS/problems/DNASTORAGE
public class Day8 {
// 00 is replaced with A
// 01 is replaced with T
// 10 is replaced with C
// 11 is replaced with G
    public static void main(String[] args){
        String str = "00";
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i < n -1){
            String s = str.substring(i, i+2);
            if(s.equals("00")){
                sb.append("A");
            }else if(s.equals("01")){
                sb.append("T");
            }else if(s.equals("10")){
                sb.append("C");
            }else if(s.equals("11")){
                sb.append("G");
            }
            i += 2;
        }
        System.out.println(sb.toString());
    }
}
