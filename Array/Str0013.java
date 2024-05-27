public class Str0013 {
    public static boolean checkItPaindrome(String str){
        int i=0;
        int j = str.length() -1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        String str = "ababa";
        boolean x = checkItPaindrome(str);
        if(x == true){
            System.out.println("1");
        }else{
            System.out.println("1");
        }
    }
}
