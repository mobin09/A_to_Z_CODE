public class Pattern19 {
    public static void pattern19Upper(int n){
        for(int i=0; i<n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print("*");
            }
            // for space
            for(int j = 1; j<= 2 * i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern19Lower(int n){
        for(int i=1; i<=n; i++){
            // *
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // for space
            for(int j = 1; j<=2 * (n -i); j++){
                System.out.print(" ");
            }
            // for *
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        pattern19Upper(n);
        pattern19Lower(n);
    }
}