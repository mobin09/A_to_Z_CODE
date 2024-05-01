


public class Day1{
    public static int reverseNum(int x){
        int res = 0;
        while(x != 0){
            int pop = x % 10;
            res = res * 10 + pop;

            x /= 10;
        }
        return res;
    }
    public static void main(String[] args){
        // find the number is palimdrome or not
        int  num = 121;
        if(num < 0){
            System.out.println("false");
            return;
        }
       int y =  reverseNum(121);
       if(y == num){
        System.out.println("true");
       }else{
        System.out.println("false");
       }
    }

}