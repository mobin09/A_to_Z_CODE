public class Pattern7 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n; i++){
            // for left spaces
            for(int j = 1; j<=n-i; j++){
                IO.print(" ");
            }
            // for *
            for(int j = 1; j <= i * 2 -1; j++){
                IO.print("*");
            }
            IO.println();
        }
    }
}
