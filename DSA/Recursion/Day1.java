public class Day1{
    
    public static void sayHi(int n){
        if(n == 0){
            return;
        }
        sayHi(n-1);
        System.out.println("Hello :"+ n );
        
    }
    
    public static void main(String[] args) {
        sayHi(5);
     }
}