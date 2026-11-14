public class Pattern12 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            // count
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            // space
            for(int j=1; j<= 2 * n - 2 * i; j++){
                System.out.print(" ");
            }
            // count
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
