public class Pattern8 {
     public static void main(String[] args) {
        int n = 4;
        int shift = 0;
        for(int i=1; i<=n; i++){

            for(int j = 1; j<i; j++){
                IO.print(" ");
            }
            for(int j = 1; j<= 2 * n -i -shift ; j++){
                IO.print("*");
            }
            shift++;
            IO.println();
        }
     }
}
