public class Pattern20 {
    
    public static void pattern20Upper(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2 *n -2 * i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //6 -2 => 4
    // 3 *1 

    public static void pattern20Lower(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<= n-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<= 2 * i + 2; j++){
                    System.out.print(" ");
            }

            for(int j = 1; j<= n-i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        pattern20Upper(n);
        pattern20Lower(n-1);
    }
}