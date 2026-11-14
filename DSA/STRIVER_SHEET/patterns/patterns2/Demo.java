public class Demo {
    public static void main(String[] args) {
        int n = 4;

        for(int i =0; i< 2 * n -1; i++){
            int topDistance = i;
            for(int j=0; j< 2 * n -1; j++){
            int leftDitance = j;
            int bottomDistiance = 2 *n -2 -i;
            int rightDistance = 2 * n - 2 - j;
                int value = Math.min(
                    Math.min(topDistance, leftDitance),
                    Math.min(rightDistance, bottomDistiance)
                    );

            System.out.print(value+ " ");
            }
            System.out.println();
        }
    }
}
