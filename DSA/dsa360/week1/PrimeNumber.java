public class PrimeNumber {
   public static boolean isPrime(int n){
    // Check if n is 1 or 0
      if(n <= 1) return false;
    // Check if n is 2 or 3
      if(n == 2 || n == 3) return true;
    
    // Check whether n is divisible by 2 or 3
      if(n % 2 ==0 || n % 3 == 0) return false;
    // Check from 5 to square root of n
    // Iterate i by (i+6)
    for(int i=5; i <= Math.sqrt(n); i=i+6){
          if(n % i == 0 || n % (i +2) == 0 ){
            return false;
          }
    }
    return true;
   }

    public static void main(String[] args){
       boolean checkPrime =  isPrime(7);
         System.out.println(checkPrime); // true
    }
}