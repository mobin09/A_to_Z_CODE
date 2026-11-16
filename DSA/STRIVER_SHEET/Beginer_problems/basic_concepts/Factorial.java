public class Factorial {
    public static int calculateFact(int n){
        if(n ==0) return 1;
        return n * calculateFact(n-1);
    } 
    public static void main(String[] args) {
       int n = 5;
        int x = calculateFact(n);
        System.out.println(x);
    }
}

