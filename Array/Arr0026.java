public class Arr0026 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int missing = (n * (n+1)) /2 - sum;
        System.out.println(missing);

    }
}
