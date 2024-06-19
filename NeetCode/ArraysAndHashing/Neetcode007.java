

//https://leetcode.com/problems/length-of-last-word/description/
public class Neetcode007 {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] strArr = str.split(" ");
       int count =  strArr[strArr.length-1].length();
       System.out.println(count);
    }
}
