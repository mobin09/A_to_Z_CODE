class Solution {

    public static int countDigit(int n){
        int count = 0;
        while(n != 0){
            count++;
            n /=10;
        }
        return count;
    }

    public static int sumOfDifitPower(int n){
        int power = countDigit(n);
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += (int)Math.pow(digit, power);
            n /= 10;
        }
        return sum;
    }


    public boolean isArmstrong(int n) {
           return n == sumOfDifitPower(n);
    }
}