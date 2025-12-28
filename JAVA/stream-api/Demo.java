import java.util.Arrays;

public class Demo {
     public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 6, 3, 9, 8 };


        for(int i=0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                     // swap
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                }
            }
        }

      System.out.println(Arrays.toString(arr));


     }
}
