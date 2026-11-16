public class Pattern9 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            // space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            // *
            for(int j = 1; j<= 2 * i -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
       int m =0;
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            // *
            for(int j = 1; j<= 2 * n -i -m; j++){
                System.out.print("*");
            }
            m++;
            System.out.println();
        }
    }
}
