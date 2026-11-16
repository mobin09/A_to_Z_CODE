public class Day001 {
    public static void main(String[] args) {
        int n = 786;
        int count = 0;
        while(n != 0){
            count++;
            n /=10;
        }
        System.out.println(count);
    }
}