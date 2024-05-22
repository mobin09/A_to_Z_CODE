public class Str0003 {
    public static void main(String[] args) {
       String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
       int max = 0;
       for(int i=0; i< sentences.length; i++){
            String str = sentences[i];
            String[] arr = str.split(" ");
            if(max < arr.length){
                max = arr.length;
            }
       }
       System.out.println(max);

    }
}
