public class Str0010 {
    public static void main(String[] args) {
         String str = "string";
         int indexI = str.indexOf("i");
         StringBuilder sb = new StringBuilder();
         for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == 'i'){
                sb.append(str.substring(0, indexI));
            }
         }

    }
}
