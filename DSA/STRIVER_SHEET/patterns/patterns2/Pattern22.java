public class Pattern22 {
    public static void main(String[] args) {
        int n =4;
        for(int i=0; i<2 *n-1; i++){
            int topDistance= i;
            int bottomDistaince = 2 * n -2 -i;
            for(int j=0; j< 2 * n -1; j++){
                int leftDistance = j;
                int rightDistance = 2 * n -2 - j;
                int value = Math.min(
                    Math.min(topDistance, bottomDistaince),
                    Math.min(leftDistance, rightDistance)
                );

                System.out.print(n-value + " ");

            }
            System.out.println();
        }
    }
}