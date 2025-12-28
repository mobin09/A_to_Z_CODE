//https://www.codechef.com/practice/course/strings/STRINGS/problems/HAPPYSTR?tab=statement
public class Str0001 {
    public static void main(String[] args){
        String str  = "abcdeeafg";
        boolean isHappy = false;
        String vowels = "aeiou";
        for(int i=0; i< str.length()-3; i++){
            String ch1 = str.charAt(i) + "";
            String ch2 = str.charAt(i+1)+"";
            String ch3 = str.charAt(i+2) +"";
            if(vowels.contains(ch1) && vowels.contains(ch2) && vowels.contains(ch3)){
                isHappy = true;
                break; 
            }
        }
        if(isHappy == true){
            System.out.println("Happy");
        }else{
            System.out.println("Sad");
        }

                     
    }
}
