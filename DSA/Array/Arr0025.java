public class Arr0025 {
    public static void main(String[] args) {
        // Kadane’s algorithm:
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int max_so_for = Integer.MIN_VALUE;
        int max_sum_ending_here = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        for(int i=0; i<arr.length; i++){
            max_sum_ending_here = max_sum_ending_here + arr[i];
            if(max_so_for < max_sum_ending_here){
                max_so_for = max_sum_ending_here;
                start = s;
                end = i;
            }
            if(max_sum_ending_here < 0){
                max_sum_ending_here = 0;
                  s = i + 1;
            }
        }
        System.out.println("Max Sum" + max_so_for);
        System.out.println("Start - End index" + start + ":" + end);

    }
}
