public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = n; j>=i; j--){
                IO.print("*");
            }
            IO.println();
        }
    }
}
