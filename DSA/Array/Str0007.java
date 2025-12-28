import java.util.Arrays;
public class Str0007 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch  ='d';
       int index = word.indexOf(ch);
       if(index != -1){
         char[] arr = word.toCharArray();
         int start = 0;
         int end = index;
         while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
         }
         word = String.valueOf(arr);
        System.out.println(word);
        return;
       }
       //System.out.println(word);
       return;
    }
}
