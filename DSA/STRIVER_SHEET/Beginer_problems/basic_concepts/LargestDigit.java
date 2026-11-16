public class LargestDigit {
    public static void main(String[] args) {
        int m = 786;
        int maxDigit = m % 10;

        while(m != 0){
            int digit = m % 10;
            if(digit >maxDigit){
                maxDigit = digit;
            }
            m /= 10;
        }
        System.out.println(maxDigit);
    }
}
