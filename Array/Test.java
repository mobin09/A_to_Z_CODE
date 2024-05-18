import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
       String str = "My name is Md shamim";
       char[] arr = str.toCharArray();
       String vovels = "aeiou";
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            String ch = str.charAt(start)+"";
            String ch2 = str.charAt(end)+"";
            int i = -1;
              if(vovels.contains(ch)){
                i = start;
              }else{
                start++;
              }
              int j = -1;
              if(vovels.contains(ch2)){
                j = end;
              }else{
                end--;
              }
              if(i != -1 & j !=-1){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                start++;
                end--;
              }
        }
        System.out.println(String.valueOf(arr));
    }
}
